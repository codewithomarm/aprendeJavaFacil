package com.codewithomar.modificadores.publico.main;

import com.codewithomar.modificadores.publico.modelo.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.nombre = "Omar Montoya";

        System.out.println(persona.nombre);
    }
}
