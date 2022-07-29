package com.ap.ap.services;

import com.ap.ap.models.Certificacion;
import com.ap.ap.repository.CertificacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class CertificacionService {

    private final CertificacionRepo certificacionRepo;

    @Autowired
    public CertificacionService(CertificacionRepo certificacionRepo) {
        this.certificacionRepo = certificacionRepo;
    }
    public Certificacion addCertificacion(Certificacion certificacion){
        return certificacionRepo.save(certificacion);
    }
    public List<Certificacion> buscarCertificaciones(){
        return certificacionRepo.findAll();
    }
    public Certificacion editarCertificacion(Certificacion certificacion){
        return certificacionRepo.save(certificacion);
    }
    public void borrarCertificacion(Long id){
        certificacionRepo.deleteById(id);
    }
}




