package com.ap.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Certificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCerti;
    private String tituloCerti;
    private int fechaCerti;
    private  String descCerti;
    private  String imagenCerti;

    public Certificacion(){

    }

    public Certificacion(Long idCerti, String tituloCerti, int fechaCerti, String descCerti, String imagenCerti) {
        this.idCerti = idCerti;
        this.tituloCerti = tituloCerti;
        this.fechaCerti = fechaCerti;
        this.descCerti = descCerti;
        this.imagenCerti = imagenCerti;
    }

    public Long getIdCerti() {
        return idCerti;
    }

    public void setIdCerti(Long idCerti) {
        this.idCerti = idCerti;
    }

    public String getTituloCerti() {
        return tituloCerti;
    }

    public void setTituloCerti(String tituloCerti) {
        this.tituloCerti = tituloCerti;
    }

    public int getFechaCerti() {
        return fechaCerti;
    }

    public void setFechaCerti(int fechaCerti) {
        this.fechaCerti = fechaCerti;
    }

    public String getDescCerti() {
        return descCerti;
    }

    public void setDescCerti(String descCerti) {
        this.descCerti = descCerti;
    }

    public String getImagenCerti() {
        return imagenCerti;
    }

    public void setImagenCerti(String imagenCerti) {
        this.imagenCerti = imagenCerti;
    }
}
