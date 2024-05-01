package com.prototype.objects;

import java.util.Hashtable;

import com.prototype.interfaces.IVehiculo;

public class RegistroVehiculos {
    private final Hashtable<String, IVehiculo> prototypos = new Hashtable<>();

    public void adicionarProtypo(String llave, IVehiculo vehiculo){
        prototypos.put(llave, vehiculo);
    }

    public IVehiculo obtenerProtipo(String llave){
        return prototypos.get(llave);
    }
}
