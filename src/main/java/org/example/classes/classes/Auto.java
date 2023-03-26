package org.example.classes.classes;

public class Auto extends Vehiculos {
    private int kmAuto;

    public Auto(){}

    public Auto(int kmAuto){

        this.kmAuto=kmAuto;

        }

    public int getKmAuto(){
        return kmAuto;
    }

    public void setKmAuto(int kmAuto) {
        this.kmAuto = kmAuto;
    }
}
