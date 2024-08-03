package com.example.demo.unsolid;

public interface EmployeeOperations {
    void addEmployee(String name);

    void removeEmployee(String name);

    double calculateSalary(String name);

    void saveToFile(String name);
}

/*
ISP: La interfaz EmployeeOperations agrupa métodos que representan
responsabilidades muy diferentes gestión de empleados (agregar, eliminar),
cálculo de salarios y persistencia de datos. El ISP establece que una interfaz
debe ser específica y enfocarse en un conjunto cohesivo de operaciones.
La solución es básicamente eliminar esta interfaz EmployeeOperations ya que es redundante. La clase
EmployeeManager ya implementa las funcionalidades necesarias a través de la
inyección de dependencias y la delegación de responsabilidades.
 */
