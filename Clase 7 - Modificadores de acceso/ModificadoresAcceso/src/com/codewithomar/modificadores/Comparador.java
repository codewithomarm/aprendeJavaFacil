package com.codewithomar.modificadores;

//Interface que define metodos para comparar objetos
public interface Comparador<T> {
    boolean menorQue(T objeto);

    boolean menorIgualQue(T objeto);

    boolean igualQue(T objeto);

    boolean mayorQue(T objeto);

    boolean mayorIgualQue(T objeto);
}
