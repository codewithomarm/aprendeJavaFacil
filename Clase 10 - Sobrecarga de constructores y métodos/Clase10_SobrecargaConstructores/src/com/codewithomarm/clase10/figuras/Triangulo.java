package com.codewithomarm.clase10.figuras;

//Clase POJO que almacena los datos de un triángulo
public class Triangulo {
    //Declaración de atributos
    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;
    private double base;

    //Constructor vacío por defecto
    public Triangulo(){}

    //Constructor con parámetros
    public Triangulo(double lado1, double lado2, double lado3,
                     double altura, double base) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
        this.base = base;
    }

    //Getter atributo lado1
    public double getLado1() {
        return lado1;
    }

    //Setter atributo lado1
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    //Getter atributo lado2
    public double getLado2() {
        return lado2;
    }

    //Setter atributo lado2
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    //Getter atributo lado3
    public double getLado3() {
        return lado3;
    }

    //Setter atributo lado3
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    //Getter atributo altura
    public double getAltura() {
        return altura;
    }

    //Setter atributo latura
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Getter atributo base
    public double getBase() {
        return base;
    }

    //Setter atributo base
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", altura=" + altura +
                ", base=" + base +
                '}';
    }
}
