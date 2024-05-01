package com.emilia.galarza.factory;

public class Cuadrado implements FigurasGeometricas{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void crear() {
        System.out.println("Cuadrado creado con lado: " + lado);
    }
}
