package com.ap.ap.models;

import javax.persistence.*;

@Entity
public class Interes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idInteres;
    private String tituloInteres;
    private int fechaInteres;
    @Column(length = 1000)
    private  String descInteres;
    @Column(length = 1000)
    private  String imagenInteres;

    public Interes(){

    }

    public Interes(Long idInteres, String tituloInteres, int fechaInteres, String descInteres, String imagenInteres) {
        this.idInteres = idInteres;
        this.tituloInteres = tituloInteres;
        this.fechaInteres = fechaInteres;
        this.descInteres = descInteres;
        this.imagenInteres = imagenInteres;
    }

    public Long getIdInteres() {
        return idInteres;
    }

    public void setIdInteres(Long idInteres) {
        this.idInteres = idInteres;
    }

    public String getTituloInteres() {
        return tituloInteres;
    }

    public void setTituloInteres(String tituloInteres) {
        this.tituloInteres = tituloInteres;
    }

    public int getFechaInteres() {
        return fechaInteres;
    }

    public void setFechaInteres(int fechaInteres) {
        this.fechaInteres = fechaInteres;
    }

    public String getDescInteres() {
        return descInteres;
    }

    public void setDescInteres(String descInteres) {
        this.descInteres = descInteres;
    }

    public String getImagenInteres() {
        return imagenInteres;
    }

    public void setImagenInteres(String imagenInteres) {
        this.imagenInteres = imagenInteres;
    }
}
