package com.codewithomarm.clase10.main;

import com.codewithomarm.clase10.calculos.CalculoTriangulo;
import com.codewithomarm.clase10.figuras.Triangulo;

//Clase Main para probar la clase CalculoTriangulo
public class Main {
    public static void main(String[] args) {
        //Declaración e instanciación de objeto de tipo Triangulo
        Triangulo triangulo1 = new Triangulo();
        //Definición de los valores de los atributos del objeto triangulo1
        triangulo1.setLado1(15.00);
        triangulo1.setLado2(25.00);
        triangulo1.setLado3(35.00);
        triangulo1.setAltura(28.00);
        triangulo1.setBase(25.00);

        //Declaración e instanciación de objeto de tipo CalculoTriangulo
        CalculoTriangulo calculo1 = new CalculoTriangulo();

        //Asignar objeto triangulo1 al objeto calculo1 para satisfacer dependencia
        calculo1.setTriangulo(triangulo1);

        //Impresión de los calculos de las propiedades del calculo1 con el triangulo1
        System.out.println("--------Objeto triangulo1--------");
        System.out.println(calculo1.mostrarCalculos());

        //Declaración e instanciación de objeto de tipo Triangulo
        Triangulo triangulo2 = new Triangulo();
        //Definición de los valores de los atributos del objeto triangulo1
        triangulo2.setLado1(40.00);
        triangulo2.setLado2(40.00);
        triangulo2.setLado3(30.00);
        triangulo2.setAltura(40.00);
        triangulo2.setBase(40.00);

        /*Declaración e instanciación de objeto de tipo CalculoTriangulo
         *a la misma vez que se le asigna el objeto triangulo2 */
        CalculoTriangulo calculo2 = new CalculoTriangulo(triangulo2);

        //Impresión de los calculos de las propiedades del calculo2 con el triangulo2
        System.out.println("--------Objeto triangulo2--------");
        System.out.println(calculo2.mostrarCalculos());

        /*Declaración e instanciación de objeto de tipo CalculoTriangulo
         *a la misma vez que se instancia un objeto de tipo Triangulo en el constructor */
        CalculoTriangulo calculo3 = new CalculoTriangulo(new Triangulo(60, 60, 60, 45, 60));

        //Impresión de los calculos de las propiedades del calculo3
        System.out.println("--------Objeto triangulo3--------");
        System.out.println(calculo3.mostrarCalculos());

        /*Declaración e instanciación de objeto de tipo CalculoTriangulo
         *pasandole los valores de los atributos de su dependencia triangulo */
        CalculoTriangulo calculo4 = new CalculoTriangulo(5, 3, 2, 1.5, 5);

        //Impresión de los calculos de las propiedades del calculo3
        System.out.println("--------Objeto triangulo4--------");
        System.out.println(calculo4.mostrarCalculos());
    }
}
