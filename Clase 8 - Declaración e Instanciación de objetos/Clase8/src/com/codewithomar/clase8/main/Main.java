package com.codewithomar.clase8.main;

import com.codewithomar.clase8.producto.Producto;

/* Clase para declarar, instanciar y utilizar objetos
 * de tipo Producto */
public class Main {
    public static void main(String[] args) {
        //Declaración de objeto de tipo Producto
        Producto producto;
        //Instanciación del objeto producto
        producto = new Producto();

        //Impresión de los atributos del objeto producto
        System.out.println("Objeto producto:");
        System.out.println(producto.toString());
        System.out.println(); //Salto de línea

        //Declaración de objeto de tipo Producto
        Producto producto2;
        //Instanciación del objeto producto2
        producto2 = new Producto();

        //Asignación de valores a los atributos de producto2
        producto2.setId(2);
        producto2.setDetalle("Impresora Canon PIXMA G4110");
        producto2.setPrecioUnitario(225.95);
        producto2.setCantidad(10);

        //Impresión de los atributos del objeto producto2
        System.out.println("Objeto producto2:");
        System.out.println(producto2.toString());
        System.out.println(); //Salto de línea

        //Declaración de objeto de tipo Producto
        Producto producto3;
        //Instanciación del objeto producto3
        producto3 = new Producto(3, "Silla de Oficina Herman Miller",
                300.00, 4);

        //Impresión de los atributos del objeto producto3
        System.out.println("Objeto producto3:");
        System.out.println(producto3.toString());
        System.out.println();

        //Declaración e instanciación del objeto producto4
        Producto producto4 = new Producto(4, "Pluma BIC Azul Punta Fina",
                0.25, 200);

        //Impresión de los atributos del objeto producto4
        System.out.println("Objeto producto4:");
        System.out.println(producto4.toString());
    }
}