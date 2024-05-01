package com.factory;

public class Circulo implements FigurasGeometricas{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void crear() {
        System.out.println("Circulo creado con radio: " + radio);
    }

}
