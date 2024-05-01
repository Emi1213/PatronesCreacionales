package com.prototype.objects;

import com.prototype.interfaces.IVehiculo;

public class Taxi extends Vehiculo{
    private int numPuertas;
    public Taxi() {
        super();
    }
    
    public Taxi(String marca, String modelo, String color, int numPuertas) {
        super(marca, modelo, color);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Taxi [numPuertas=" + numPuertas + super.toString() +"]";
    }

    public IVehiculo clone() {
        Taxi taxi = new Taxi();
        taxi.setMarca(this.marca);
        taxi.setModelo(this.modelo);
        taxi.setColor(this.color);
        taxi.setNumPuertas(this.numPuertas);
        return taxi;
    }
}
