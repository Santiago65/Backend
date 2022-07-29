package com.ap.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idHabilidad;
    private String nombreHabilidad;
    private String fotoHabilidad;
    private String porcentajeHabilidad;

    public Habilidad(){

    }

    public Habilidad(long idHabilidad, String nombreHabilidad, String fotoHabilidad, String porcentajeHabilidad) {
        this.idHabilidad = idHabilidad;
        this.nombreHabilidad = nombreHabilidad;
        this.fotoHabilidad = fotoHabilidad;
        this.porcentajeHabilidad = porcentajeHabilidad;
    }

    public long getIdHabilidad() {
        return idHabilidad;
    }

    public void setIdHabilidad(long idHabilidad) {
        this.idHabilidad = idHabilidad;
    }

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }

    public String getFotoHabilidad() {
        return fotoHabilidad;
    }

    public void setFotoHabilidad(String fotoHabilidad) {
        this.fotoHabilidad = fotoHabilidad;
    }

    public String getPorcentajeHabilidad() {
        return porcentajeHabilidad;
    }

    public void setPorcentajeHabilidad(String porcentajeHabilidad) {
        this.porcentajeHabilidad = porcentajeHabilidad;
    }
}
