package com.example.demo.unsolid;

public interface SalaryCalculator {
    double calculateSalary(String name);
}

/* SRP (Single Responsibility Principle):

La clase SalaryCalculator debería solo calcular salarios, pero está creando una instancia 
de EmployeeManager, lo cual introduce otra responsabilidad.

DIP (Dependency Inversion Principle):
La clase SalaryCalculator depende directamente de EmployeeManager, que es una clase de bajo nivel. Debería depender de una abstracción.
*/