package com.example.demo.unsolid;

public class SalaryCalculator {
    private final EmployeeManager employeeManager;

    public SalaryCalculator(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    public double calculateSalary(String name) {
        return employeeManager.calculateSalary(name);
    }
}


// SRP (Single Responsibility Principle):
//La clase SalaryCalculator debería solo calcular salarios, pero está creando una instancia
//de EmployeeManager, lo cual introduce otra responsabilidad.

//DIP (Dependency Inversion Principle):
//La clase SalaryCalculator depende directamente de EmployeeManager, que es una clase
// de bajo nivel. Debería depender de una abstracción.