package com.builder;

//import com.builder.objects.Direccion;
import com.builder.objects.Empleado;

public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado.EmpleadoBuilder().setEdad(1).setDireccion("Ambato", "Ambato", "1222").build();
        System.out.println(empleado.toString());
    }
}
