package com.codewithomar.modificadores;

public class Proceso {
    //Declaración de atributos
    private Cliente cliente;

    public Proceso(){
    }

    public Proceso(Cliente cliente){
        this.cliente = cliente;
    }

    public String mostrarNombreCliente(){
        return unirNombreCliente();
    }

    private String unirNombreCliente(){
        String nombreCompleto = null;
        if (cliente.getNombre() != null && cliente.getApellido() != null) {
            nombreCompleto = cliente.getNombre() + cliente.getApellido();
        } else {
            System.out.println("Nombre del cliente imcompleto");
        }
        return nombreCompleto;
    }
}
