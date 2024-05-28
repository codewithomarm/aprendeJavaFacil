package com.codewithomarm.clase10.bono;

import com.codewithomarm.clase10.trabajadores.Agente;
import com.codewithomarm.clase10.trabajadores.Gerente;
import com.codewithomarm.clase10.trabajadores.Supervisor;

public class CalculoBono {
    //Constructor por defecto
    public CalculoBono() {
    }

    //Calcular el bono de un Agente
    public double calcularBono(Agente agente){
        return agente.getSalario() * 0.15;
    }

    //Calcular el bono de un Supervisor
    public double calcularBono(Supervisor supervisor){
        return supervisor.getSalario() * 0.30;
    }

    //Calcular el bono de un Gerente
    public double calcularBono(Gerente gerente){
        return gerente.getSalario() * 0.5;
    }
}
