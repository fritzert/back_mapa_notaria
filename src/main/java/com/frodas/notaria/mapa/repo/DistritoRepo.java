package com.frodas.notaria.mapa.repo;

import com.frodas.notaria.mapa.model.DistritoNotarial;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DistritoRepo extends MongoRepository<DistritoNotarial, String> {

    @Query("{'habilitado' : ?0 }")
    List<DistritoNotarial> findAllByHabilitado(Boolean habilitado);

    @Query("{'habilitado' : ?0 , 'codigo':  ?1}")
    Optional<DistritoNotarial> findByHabilitadoAndCodigo(Boolean habilitado, String codigo);

}


