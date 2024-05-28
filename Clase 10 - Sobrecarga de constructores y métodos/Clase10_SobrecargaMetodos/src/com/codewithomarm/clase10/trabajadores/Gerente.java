package com.codewithomarm.clase10.trabajadores;

public class Gerente {
    //Declaración de atributos
    private String nombre;
    private String apellido;
    private String departamento;
    private double salario;

    //Constructor con parámetros
    public Gerente(String nombre, String apellido, String departamento, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.salario = salario;
    }

    //Getter atributo nombre
    public String getNombre() {
        return nombre;
    }

    //Setter atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getter atributo apellido
    public String getApellido() {
        return apellido;
    }

    //Setter atributo apellido
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Getter atributo departamento
    public String getDepartamento() {
        return departamento;
    }

    //Setter atributo departamento
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Getter atributo salario
    public double getSalario() {
        return salario;
    }

    //Setter atributo salario
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }
}
