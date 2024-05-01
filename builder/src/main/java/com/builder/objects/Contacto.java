package com.builder.objects;

public class Contacto {
    private String nombre;
    private NumeroContacto nroContacto;
    private Direccion direccion;
    public Contacto() {
    }

    public Contacto(String nombre, NumeroContacto nroContacto, Direccion direccion) {
        this.nombre = nombre;
        this.nroContacto = nroContacto;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NumeroContacto getNroContacto() {
        return nroContacto;
    }

    public void setNroContacto(NumeroContacto nroContacto) {
        this.nroContacto = nroContacto;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    
}
