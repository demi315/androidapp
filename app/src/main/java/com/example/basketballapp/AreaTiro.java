package com.example.basketballapp;

public class AreaTiro extends Tiro {
    private int Zona;

    public AreaTiro(int idTiro,boolean acierto,double desviacion,int Zona){
        super(idTiro,acierto,desviacion);
        this.Zona = Zona;
    }



}
