package com.example.demo.unsolid;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        if (name == null || name.isEmpty()) {
            return "No name available";
        }
        return name;
    }
}

// LSP (Liskov Substitution Principle):
//La subclasee PartTimeEmployee rompe el comportamiento esperado
//de la clase base Employee al lanzar una excepción en getName.
//Una subclase debe poder ser sustituible por su superclase
// sin alterar el comportamiento esperado del programa.


