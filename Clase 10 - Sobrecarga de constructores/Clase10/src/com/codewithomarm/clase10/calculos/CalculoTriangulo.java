package com.codewithomarm.clase10.calculos;

import com.codewithomarm.clase10.figuras.Triangulo;

/*Clase que contiene los procesos para calcular
* las propiedas del triángulo*/
public class CalculoTriangulo {
    //Declaración de atributos
    private Triangulo triangulo;
    private static final double pi = 3.14;

    //Constructor vacío por defecto
    public CalculoTriangulo(){}

    //Constructor con parámetros
    public CalculoTriangulo(Triangulo triangulo){
        this.triangulo = triangulo;
    }

    //Constructor con parámetros de los atributos del triángulo
    public CalculoTriangulo(double lado1, double lado2, double lado3,
                            double altura, double base){
        this.triangulo = new Triangulo(lado1, lado2, lado3, altura, base);
    }

    //Setter atributo triangulo
    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    //Mostrar Todos los calculos del triangulo
    public String mostrarCalculos(){
        return triangulo.toString() + "\n" +
                "Calculos del Triángulo {" + "\n" +
                "\t" + "Area = " + calcularArea() + "\n" +
                "\t" + "Perímetro = " + calcularPerimetro() + "\n" +
                "\t" + "Semiperímetro = " + calcularSemiperimetro() + "\n" +
                "\t" + "Circunferencia Circunscrita = " + calcularCircunfCirc() + "\n" +
                "\t" + "Circunferencia Inscrita = " + calcularCircunfInsc() + "\n" +
                '}';
    }

    //Calcular el area del triángulo
    private double calcularArea(){
        double area;
        area = (triangulo.getBase() * triangulo.getAltura()) / 2;
        return area;
    }

    //Calcular el perímetro del triángulo
    private double calcularPerimetro(){
        double perimetro;
        perimetro = triangulo.getLado1()+ triangulo.getLado2()+
                triangulo.getLado3();
        return perimetro;
    }

    //Calcular el semiperímetro del triángulo
    private double calcularSemiperimetro() {
        double semi;
        semi = calcularPerimetro() / 2;
        return semi;
    }

    //Calcular la circunferencia circunscrita del triángulo
    private double calcularCircunfCirc(){
        double radio;
        radio = (triangulo.getLado1() * triangulo.getLado2() *
                triangulo.getLado3()) / (4 * calcularArea());
        double circunferencia;
        circunferencia = pi * (radio * 2);
        return circunferencia;
    }

    //Calcular la circunferencia Inscrita del triángulo
    private double calcularCircunfInsc(){
        double radio;
        radio = calcularArea() / calcularSemiperimetro();
        double circunferencia;
        circunferencia = pi * (radio * 2);
        return circunferencia;
    }
}
