package com.prototype.objects;

import com.prototype.interfaces.IVehiculo;

public class Bus extends Vehiculo {
    private int numPasajeros;
    public Bus() {
        super();
    }

    public Bus(String marca, String modelo, String color, int numPasajeros) {
        super(marca, modelo, color);
        this.numPasajeros = numPasajeros;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public String toString() {
        return "Bus [numPasajeros=" + numPasajeros + super.toString() + "]";
    }

    public IVehiculo clone() {
        Bus bus = new Bus();
        bus.setMarca(this.marca);
        bus.setModelo(this.modelo);
        bus.setColor(this.color);
        bus.setNumPasajeros(this.numPasajeros);
        return bus;
    }
}
