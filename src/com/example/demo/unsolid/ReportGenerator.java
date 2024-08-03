package com.example.demo.unsolid;

public class ReportGenerator {

    public void generateReportExcel(EmployeeManager employeeManager) {
        // Generar reporte
    }

    public void generateReportPDF(EmployeeManager employeeManager) {
        // Generar reporte
    }
}

/* SRP (Single Responsibility Principle):
La clase ReportGenerator tiene múltiples responsabilidades: generar reportes en Excel y PDF. 
Debería enfocarse en una sola responsabilidad o delegar estas tareas a otras clases.


DIP (Dependency Inversion Principle):
La clase ReportGenerator depende directamente de EmployeeManager, que es una clase de bajo nivel. Debería depender de una abstracción en lugar de una implementación concreta.
*/