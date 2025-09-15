/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class Main_Empleado {
    public static void main(String[] args) {
        
        // Crearemos empleados con ambos constructores
        
        Empleado emp1 = new Empleado(1, " Ezequiel Sanabria", " Desarrollador", 2500.0);
        Empleado emp2 = new Empleado(" Santiago Salinas", " Analista");

        // Mostraremos la información inicial
        
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

        // Aplicaremos aumentos de salario
        
        emp1.actualizarSalario(10.0); // 10%
        emp2.actualizarSalario(200);   // 200 fijos

        // Aca vamos a mostrar después del aumento
        
        System.out.println("\nDespues del aumento:");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

        // Mostraremos el total de empleados
        
        System.out.println("\nTotal de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
