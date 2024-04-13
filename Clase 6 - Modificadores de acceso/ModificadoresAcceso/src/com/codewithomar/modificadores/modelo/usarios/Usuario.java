package com.codewithomar.modificadores.modelo.usarios;

import com.codewithomar.modificadores.modelo.Persona;

public class Usuario extends Persona {
    private String nombreUsuario;

    public Usuario(){
        super.nombre = "Omar";
        this.nombreUsuario = "codewithomarm";
    }
}
