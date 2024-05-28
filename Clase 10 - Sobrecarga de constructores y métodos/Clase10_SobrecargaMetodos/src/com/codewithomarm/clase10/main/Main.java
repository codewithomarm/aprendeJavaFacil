package com.codewithomarm.clase10.main;

import com.codewithomarm.clase10.bono.CalculoBono;
import com.codewithomarm.clase10.trabajadores.Agente;
import com.codewithomarm.clase10.trabajadores.Gerente;
import com.codewithomarm.clase10.trabajadores.Supervisor;

public class Main {
    public static void main(String[] args) {
        //Declaración e instanciación de un objeto CalculoBono
        CalculoBono calculo = new CalculoBono();

        //Declaración e instanciación de un objeto Agente
        Agente agente = new Agente("Omar", "Montoya",
                "Dell", 800.00);

        //Declaración e instanciación de un objeto Supervisor
        Supervisor supervisor = new Supervisor("John", "Mayer",
                "Under Armour", 1500.00);

        //Declaración e instanciación de un objeto Gerente
        Gerente gerente = new Gerente("Anahi", "Puente",
                "Amazon", 3000.00);

        System.out.println("El bono del agente " + agente.getNombre() + " " +
                agente.getApellido() + " es de $" + calculo.calcularBono(agente) + "\n");

        System.out.println("El bono del supervisor " + supervisor.getNombre() + " " +
                supervisor.getApellido() + " es de $" + calculo.calcularBono(supervisor) + "\n");

        System.out.println("El bono del gerente " + gerente.getNombre() + " " +
                gerente.getApellido() + " es de $" + calculo.calcularBono(gerente));
    }
}
