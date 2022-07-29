package com.ap.ap.services;

import com.ap.ap.models.Interes;
import com.ap.ap.repository.InteresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InteresService {

    private final InteresRepo interesRepo;

    @Autowired
    public InteresService(InteresRepo interesRepo) {
        this.interesRepo = interesRepo;
    }
    public Interes addInteres(Interes interes){
        return interesRepo.save(interes);
    }
    public List<Interes> buscarIntereses(){
        return interesRepo.findAll();
    }
    public Interes editarInteres(Interes interes){
        return interesRepo.save(interes);
    }
    public void borrarInteres(Long id){
        interesRepo.deleteById(id);
    }
}
