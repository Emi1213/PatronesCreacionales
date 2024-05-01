package com.builder.objects;

public class Direccion {
    private String direccion;
    private String ciudad;
    private String codigoPostal;

    public Direccion() {
        super();
    }

    public Direccion(String direccion, String ciudad, String codigoPostal) {
        super();
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;   
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Direccion [direccion=" + direccion + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + "]";
    }

    

    

}