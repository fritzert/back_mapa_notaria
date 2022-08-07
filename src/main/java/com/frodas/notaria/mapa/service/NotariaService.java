package com.frodas.notaria.mapa.service;

import com.frodas.notaria.mapa.dto.DistritoGis;
import com.frodas.notaria.mapa.dto.DistritoInfo;

public interface NotariaService {

	DistritoGis listarDistritos();

	DistritoInfo buscarDistritoPorId(String codDistrito);

}
