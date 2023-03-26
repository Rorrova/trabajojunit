package org.example.classes.classes;

public class Vehiculos{
    private int patente;
    private int cantespejos;
    private int cantruedas;

    public Vehiculos(){}

    public Vehiculos(int patente, int cantespejos,int cantruedas){
        this.patente=patente;
        this.cantespejos=cantespejos;
        this.cantruedas=cantruedas;
    }

    public int getPatente() {
        return patente;
    }

    public int getCantespejos() {
        return cantespejos;
    }

    public int getCantruedas() {
        return cantruedas;
    }
    public void setPatente(int patente){
        this.patente=patente;
    }
    public void setCantespejos(int cantespejos){
        this.cantespejos=cantespejos;
    }

    public void setCantruedas(int cantruedas) {
        this.cantruedas = cantruedas;
    }
}
