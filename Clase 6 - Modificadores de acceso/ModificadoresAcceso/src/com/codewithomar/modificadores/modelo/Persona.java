package com.codewithomar.modificadores.modelo;

//Clase POJO
public class Persona {
    //Declaración de atributos
    public String nombre; //Modificador de acceso public
    //protected String nombre; //Modificador de acceso protected
    //String nombre; //Modificador de acceso default
    //private String nombre; //Modificador de acceso private

    //Constructor vacío
    public Persona(){
        this.nombre = "Omar";
    }

    //Constructor con parámetros
    public Persona(String persona){
        this.nombre = persona;
    }

    //Getter atributo persona
    public String getPersona() {
        return nombre;
    }

    //Setter atributo persona
    public void setPersona(String persona) {
        this.nombre = persona;
    }

    //ToString objeto persona
    @Override
    public String toString() {
        return "Persona{" +
                "nombre=" + nombre + '\'' +
                '}';
    }
}
