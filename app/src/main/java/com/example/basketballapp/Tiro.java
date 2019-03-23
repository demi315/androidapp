package com.example.basketballapp;

public abstract class Tiro {
    private int idTiro;
    private boolean acierto;
    private double desviacion;

    public Tiro(int idTiro,boolean acierto, double desviacion){

        this.idTiro= idTiro;
        this.acierto = acierto;
        this.desviacion = desviacion;

    }

}
