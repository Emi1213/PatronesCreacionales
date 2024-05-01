package com.prototype.objects;

import com.prototype.interfaces.IVehiculo;

public class Vehiculo implements IVehiculo{
    String marca;
    String modelo;
    String color;

    public Vehiculo() {
        super();
    }

    public Vehiculo(String marca, String modelo, String color) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
    }

    public IVehiculo clone() {
        return new Vehiculo(this.marca, this.modelo, this.color);
    }   
    
    
}
