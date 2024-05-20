package com.codewithomar.modificadores.publico.usarios;

import com.codewithomar.modificadores.publico.modelo.Persona;

public class Usuario extends Persona {
    private String nombreUsuario;

    public Usuario(){
        super.nombre = "Omar";
        this.nombreUsuario = "codewithomarm";
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", nombre='" + super.nombre + '\'' +
                '}';
    }
}
