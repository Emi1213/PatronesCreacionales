package com.builder.objects;

public class NumeroContacto {
    private String numero;
    private String extension;
    private String tipo;
    public NumeroContacto(String numero, String extension, String tipo) {
        super();
        this.numero = numero;
        this.extension = extension;
        this.tipo = tipo;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

}
