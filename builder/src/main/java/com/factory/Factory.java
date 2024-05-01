package com.factory;

import java.util.HashMap;
import java.util.Map;

public class Factory {

  private static final Map<String, FigurasGeometricas> map = new HashMap<>();

  static {
    map.put("Circulo", new Circulo());
    map.put("Cuadradonegro", new Cuadrado());
  }

  public static FigurasGeometricas getFigura(String figura) {
    return map.get(figura);
  }
}