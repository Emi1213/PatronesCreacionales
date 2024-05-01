package com.factory;

public class Main {
  public static void main(String[] args) {
    FigurasGeometricas circulo = Factory.getFigura("Circulo");
    circulo.crear();
    FigurasGeometricas cuadrado = Factory.getFigura("Cuadrado");
    cuadrado.crear();
  }
}
