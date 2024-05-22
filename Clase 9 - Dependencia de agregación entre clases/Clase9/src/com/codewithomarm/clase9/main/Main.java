package com.codewithomarm.clase9.main;

import com.codewithomarm.clase9.calculos.CalculoTriangulo;
import com.codewithomarm.clase9.figuras.Triangulo;

//Clase Main para probar la clase CalculoTriangulo
public class Main {
    public static void main(String[] args) {
        //Declaración e instanciación de objeto de tipo Triangulo
        Triangulo triangulo = new Triangulo();
        //Definición de los valores de los atributos del objeto triangulo
        triangulo.setLado1(10.00);
        triangulo.setLado2(20.00);
        triangulo.setLado3(30.00);
        triangulo.setAltura(15.00);
        triangulo.setBase(30.00);

        //Declaración e instanciación de objeto de tipo CalculoTriangulo
        CalculoTriangulo calculo = new CalculoTriangulo();
        //Definición del objeto triangulo del objeto calculo
        calculo.setTriangulo(triangulo);

        //Impresión de los datos del atributo triangulo del objeto calculo
        System.out.println(calculo.getTriangulo().toString());
    }
}
