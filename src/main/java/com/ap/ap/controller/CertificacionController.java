package com.ap.ap.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ap.ap.models.Certificacion;
import com.ap.ap.services.CertificacionService;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://portfoliostgo.web.app")
@RequestMapping ("/certificacion")

public class CertificacionController{
    private final CertificacionService certificacionService;

    public CertificacionController(CertificacionService certificacionService)
    {
        this.certificacionService=certificacionService;

    }
    @GetMapping("/all")
    public ResponseEntity<List<Certificacion>> obtenerCertificacion(){
        List<Certificacion> certificaciones=certificacionService.buscarCertificaciones();
        return new ResponseEntity<>(certificaciones, HttpStatus.OK);

    }
    @PutMapping("/update")
    public ResponseEntity<Certificacion> editarCertificacion(@RequestBody Certificacion certificacion){
        Certificacion updateCertificacion=certificacionService.editarCertificacion(certificacion);
        return new ResponseEntity<>(updateCertificacion,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Certificacion> crearCertificacion(@RequestBody Certificacion certificacion){
        Certificacion nuevaCertificacion=certificacionService.addCertificacion(certificacion);
        return new ResponseEntity<>(nuevaCertificacion,HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarCertificacion(@PathVariable("id") Long id){
        certificacionService.borrarCertificacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}


