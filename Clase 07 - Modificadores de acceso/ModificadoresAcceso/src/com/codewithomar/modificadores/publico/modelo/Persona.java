package com.codewithomar.modificadores.publico.modelo;

//Clase POJO
public class Persona {
    //Declaración de atributos
    public String nombre; //Modificador de acceso public

    //Constructor sin parámetros
    public Persona(){
        this.nombre = "Omar";
    }

    //Constructor con parámetros
    public Persona(String nombre){
        this.nombre = nombre;
    }

    //Getter atributo persona
    public String getNombre() {
        return nombre;
    }

    //Setter atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //ToString objeto persona
    @Override
    public String toString() {
        return "Persona{" +
                "nombre=" + nombre + '\'' +
                '}';
    }
}
