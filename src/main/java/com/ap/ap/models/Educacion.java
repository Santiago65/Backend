package com.ap.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String institucionEdu;
    private String tituloEdu;
    private String tituloEdu2;
    private int fechaEduI;
    private int fechaEduF;
    private String sinfinEdu;
    private String descEdu;
    private String imagenEdu;


    public Educacion() {
    }

    public Educacion(Long idEdu, String institucionEdu, String tituloEdu, String tituloEdu2, int fechaEduI, int fechaEduF, String sinfinEdu, String descEdu, String imagenEdu) {
        this.idEdu = idEdu;
        this.institucionEdu = institucionEdu;
        this.tituloEdu = tituloEdu;
        this.tituloEdu2 = tituloEdu2;
        this.fechaEduI = fechaEduI;
        this.fechaEduF = fechaEduF;
        this.sinfinEdu = sinfinEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getInstitucionEdu() {
        return institucionEdu;
    }

    public void setInstitucionEdu(String institucionEdu) {
        this.institucionEdu = institucionEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getTituloEdu2() {
        return tituloEdu2;
    }

    public void setTituloEdu2(String tituloEdu2) {
        this.tituloEdu2 = tituloEdu2;
    }

    public int getFechaEduI() {
        return fechaEduI;
    }

    public void setFechaEduI(int fechaEduI) {
        this.fechaEduI = fechaEduI;
    }

    public int getFechaEduF() {
        return fechaEduF;
    }

    public void setFechaEduF(int fechaEduF) {
        this.fechaEduF = fechaEduF;
    }

    public String getSinfinEdu() {
        return sinfinEdu;
    }

    public void setSinfinEdu(String sinfinEdu) {
        this.sinfinEdu = sinfinEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }
}


