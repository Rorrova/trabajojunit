package org.example.classes.classes;

public class Moto extends Vehiculos {
    private int kmMoto;

    public Moto(int kmMoto){

        this.kmMoto= kmMoto;

    }

    public void setKmMoto(int kmMoto) {
        this.kmMoto = kmMoto;
    }

    public int getKmMoto() {
        return kmMoto;
    }
}
