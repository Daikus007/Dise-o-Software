package com.example.demo.unsolid;

public class Employee {

    String name;
    String departament;

    public String getName() {
        return name;
    }

    public String getDepartament() {
        return departament;
    }
}

/*
 El código no viola ninguno de los principios SOLID en la estructura básica
 que se muestra
 Pero es importante considerar cómo se podrían violar o ver futuros posibles
 escenarios:
 SRP: Si se agregaran métodos a esta clase Employee para realizar cálculos de
 nómina, la clase estaría asumiendo múltiples responsabilidades
 OCP: Si se quisiera agregar un nuevo tipo de empleado y fuera necesario modificar
 la clase Employee existente para acomodarlo.
 */
