package com.codewithomar.modificadores.privado.main;

import com.codewithomar.modificadores.privado.modelo.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.nombre = "Omar Montoya";

        System.out.println(persona.nombre);
    }
}
