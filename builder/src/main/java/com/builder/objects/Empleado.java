package com.builder.objects;

import java.util.ArrayList;
import java.util.List;

import com.builder.interfaces.BuilderInterface;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private Direccion direccion;
    private List<NumeroContacto> numeros;
    private List<Contacto> contactos;

    public Empleado() {
        super();
        this.numeros = new ArrayList<>();
        this.contactos = new ArrayList<>();
    }

    public Empleado(String nombre, String apellido, int edad, String genero, Direccion direccion, List<NumeroContacto> numeros, List<Contacto> contactos) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.numeros = numeros;
        this.contactos = contactos;
    }

    @SuppressWarnings("rawtypes")
    public static class EmpleadoBuilder implements BuilderInterface {

        private String nombre;
        private String apellido;
        private int edad;
        private String genero;
        private Direccion direccion;
        private List<NumeroContacto> numeros;
        private List<Contacto> contactos;

        public EmpleadoBuilder(){
            super();
        }

        

        public EmpleadoBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }



        public EmpleadoBuilder setApellido(String apellido) {
            this.apellido = apellido;
            return this;
        }



        public EmpleadoBuilder setEdad(int edad) {
            this.edad = edad;
            return this;
        }



        public EmpleadoBuilder setGenero(String genero) {
            this.genero = genero;
            return this;
        }


        public EmpleadoBuilder setDireccion(Direccion direccion) {
            this.direccion = direccion;
            return this;
        }

        public EmpleadoBuilder setDireccion(String direccion, String ciudad, String codigoPostal) {
            this.direccion = new Direccion(direccion, ciudad, codigoPostal);
            return this;
        }



        public EmpleadoBuilder setNumeros(List<NumeroContacto> numeros) {
            this.numeros = numeros;
            return this;
        }



        public EmpleadoBuilder setContactos(List<Contacto> contactos) {
            this.contactos = contactos;
            return this;
        }



        @Override
        public Empleado build() {
            return new Empleado(nombre, apellido, edad, genero,direccion,numeros,contactos);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<NumeroContacto> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<NumeroContacto> numeros) {
        this.numeros = numeros;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
                + ", direccion=" + direccion.toString() + ", numeros=" + numeros + ", contactos=" + contactos + "]";
    }

    
    

}
