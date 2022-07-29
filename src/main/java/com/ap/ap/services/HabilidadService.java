package com.ap.ap.services;
import com.ap.ap.models.Habilidad;
import com.ap.ap.repository.HabilidadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

 public class HabilidadService {

    private final HabilidadRepo habilidadRepo;

    @Autowired
    public HabilidadService(HabilidadRepo habilidadRepo) {
        this.habilidadRepo = habilidadRepo;
    }
    public Habilidad addHabilidad(Habilidad habilidad){
        return habilidadRepo.save(habilidad);
    }
    public List<Habilidad> buscarHabilidad(){
        return habilidadRepo.findAll();
    }
    public Habilidad editarHabilidad(Habilidad habilidad){
        return habilidadRepo.save(habilidad);
    }
    public void borrarHabilidad(Long id){
        habilidadRepo.deleteById(id);
    }
}

