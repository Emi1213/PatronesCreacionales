package com.prototype;

import com.prototype.objects.RegistroVehiculos;
import com.prototype.objects.Taxi;

public class App {
    public static void main(String[] args) {
        RegistroVehiculos registroVehiculo = new RegistroVehiculos();
        Taxi taxi = new Taxi("kia", "11","azul", 12);
        System.out.println("Taxi Original:" + taxi);
        registroVehiculo.adicionarProtypo("taxi", taxi);
        Taxi taxiClonado = (Taxi)registroVehiculo.obtenerProtipo("taxi");
        taxiClonado.setNumPuertas(4);
        System.out.println(taxiClonado.toString());

    }
}
