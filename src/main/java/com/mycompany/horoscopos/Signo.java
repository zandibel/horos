
package com.mycompany.horoscopos;


public class Signo {
  
    private String nombre;
    private String futur;

    public Signo() {
    }

    public Signo(String nombre, String prediccion) {
        this.nombre = nombre;
        this.futur = prediccion;
    }

    public String getPrediccion() {
        return futur;
    }

    public void setPrediccion(String futurs) {
        this.futur = futurs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
