package com.example.fireapp;

public class Clase {
    //Propiedades o atributos
    private String claseID, carrera, materia, tema;

    public Clase(String claseID, String carrera, String materia, String tema) {
        this.claseID = claseID;
        this.carrera = carrera;
        this.materia = materia;
        this.tema = tema;
    }

    public String getClaseID() {
        return claseID;
    }

    public void setClaseID(String claseID) {
        this.claseID = claseID;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
