package com.frodas.notaria.mapa.controller;

import com.frodas.notaria.mapa.dto.DistritoGis;
import com.frodas.notaria.mapa.dto.DistritoInfo;
import com.frodas.notaria.mapa.exception.ModeloNotFoundException;
import com.frodas.notaria.mapa.service.NotariaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notarias")
public class MapaController {

    private final NotariaService service;

    public MapaController(NotariaService service) {
        this.service = service;
    }

    // @ApiIgnore // para excluir de la documentacion de swagger-ui
    @GetMapping("/distritos")
    public ResponseEntity<DistritoGis> listar() {
        DistritoGis gis = service.listarDistritos();
        return new ResponseEntity<>(gis, HttpStatus.OK);
    }

    @GetMapping("/distritos/{id}")
    public ResponseEntity<DistritoInfo> listarPorId(@PathVariable("id") String id) {
        DistritoInfo info = service.buscarDistritoPorId(id);
        if (info.getPropiedades() == null) {
            throw new ModeloNotFoundException("ID NO ENCONTRADO : " + id);
        }
        return new ResponseEntity<>(info, HttpStatus.OK);
    }

}
