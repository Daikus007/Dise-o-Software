package com.example.demo.unsolid;

public interface EmployeeOperations {
    void addEmployee(String name);

    void removeEmployee(String name);

    double calculateSalary(String name);

    void saveToFile(String name);
}

/* ISP (Interface Segregation Principle):
La interfaz EmployeeOperations tiene métodos que no están relacionados entre sí,
 lo que obliga a las clases que la implementan a depender de métodos que pueden no necesitar.
*/
