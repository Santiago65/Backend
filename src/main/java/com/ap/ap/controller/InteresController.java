package com.ap.ap.controller;

import com.ap.ap.models.Interes;
import com.ap.ap.services.InteresService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "https://portfoliostgo.web.app")
@RequestMapping("/interes")
public class InteresController {
    private final InteresService interesService;

    public InteresController(InteresService interesService)
    {
        this.interesService=interesService;

    }
    @GetMapping("/all")
    public ResponseEntity<List<Interes>> obtenerInteres(){
        List<Interes> intereses=interesService.buscarIntereses();
        return new ResponseEntity<>(intereses, HttpStatus.OK);

    }
    @PutMapping("/update")
    public ResponseEntity<Interes> editarInteres(@RequestBody Interes interes){
        Interes updateInteres=interesService.editarInteres(interes);
        return new ResponseEntity<>(updateInteres,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Interes> crearHabilidad(@RequestBody Interes interes){
        Interes nuevaInteres=interesService.addInteres(interes);
        return new ResponseEntity<>(nuevaInteres,HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarInteres(@PathVariable("id") Long id){
        interesService.borrarInteres(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
