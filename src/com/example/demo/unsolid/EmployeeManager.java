package com.example.demo.unsolid;

public class EmployeeManager implements EmployeeRepository {
    private final EmployeeRepository employeeRepository;
    private final SalaryCalculator salaryCalculator;
    private final EmployeeDataPersistence dataPersistence;

    public EmployeeManager(EmployeeRepository employeeRepository, SalaryCalculator salaryCalculator, EmployeeDataPersistence dataPersistence) {
        this.employeeRepository = employeeRepository;
        this.salaryCalculator = salaryCalculator;
        this.dataPersistence = dataPersistence;
    }

    public void addEmployee(String name) {
        employeeRepository.addEmployee(name);
    }

    public void removeEmployee(String name) {
        employeeRepository.removeEmployee(name);
    }

    public double calculateSalary(String name) {
        return salaryCalculator.calculateSalary(name);
    }

    public void saveToFile(String name) {
        dataPersistence.saveToFile(name);
    }
}

// Violaciones de SOLID:
// 1. SRP: La clase "EmployeeManager" tiene más de una respondabilidad única (gestión de empleados, cálculo de salarios, guardado en archivos)
// 2. ISP: Implementa una interfaz con métodos que no están relacionados entre sí, , como calculateSalary y saveToFile.
