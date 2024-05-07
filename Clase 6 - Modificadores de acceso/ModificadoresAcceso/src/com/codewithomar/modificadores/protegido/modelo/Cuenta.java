package com.codewithomar.modificadores.protegido.modelo;

public class Cuenta {
    //Declaración de atributos
    private Persona persona;

    //Constructor vacío
    public Cuenta(){
        persona = new Persona();
        persona.nombre = "Omar M";
    }
}
