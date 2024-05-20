package com.codewithomar.modificadores.defecto.modelo;

public class Admin extends Persona {
    //Declaración de atributos
    private String departamento;

    //Constructor vacío
    public Admin(){
        super.nombre = "Omar";
        this.departamento = "Desarrollo";
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "departamento='" + departamento + '\'' +
                ", nombre='" + super.nombre + '\'' +
                '}';
    }
}
