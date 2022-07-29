package com.ap.ap.controller;

import com.ap.ap.models.Habilidad;
import com.ap.ap.services.HabilidadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "https://portfoliostgo.web.app")
@RequestMapping("/habilidad")
public class HabilidadController {

    private final HabilidadService habilidadService;

    public HabilidadController(HabilidadService habilidadService)
    {
        this.habilidadService=habilidadService;

    }
    @GetMapping("/all")
    public ResponseEntity<List<Habilidad>> obtenerHabilidad(){
        List<Habilidad> habilidades=habilidadService.buscarHabilidad();
        return new ResponseEntity<>(habilidades, HttpStatus.OK);

    }
    @PutMapping("/update")
    public ResponseEntity<Habilidad> editarHabilidad(@RequestBody Habilidad habilidad){
        Habilidad updateHabilidad=habilidadService.editarHabilidad(habilidad);
        return new ResponseEntity<>(updateHabilidad,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Habilidad> crearHabilidad(@RequestBody Habilidad habilidad){
        Habilidad nuevaHabilidad=habilidadService.addHabilidad(habilidad);
        return new ResponseEntity<>(nuevaHabilidad,HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarHabilidad(@PathVariable("id") Long id){
        habilidadService.borrarHabilidad(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
