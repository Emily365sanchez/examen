/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;

import examen.EmpleadoPorHoras.EmpleadoPorHoras;
import examen.Examen.clase_empleado.Empleado;

/**
 *
 * @author invitado
 */
public class Examen {
    private static Empleado EmpleadoPorContrato;
    private static Empleado EmpleadoPorHoras;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
    // Método para imprimir datos de un empleado

    /**
     *
     * @param empleado
     */
    public static void imprimirDatos(Empleado empleado) {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario anual: " + empleado.calcularSalarioAnual());
    }

    public static void main(String[] args) {
        // Crear un empleado de cada tipo
        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Juan", 3000);
        EmpleadoPorHoras empleadoPorHoras;
        EmpleadoPorHoras = new EmpleadoPorHoras("Maria", 15, 10) {};
        EmpleadoPorContrato empleadoPorContrato = new EmpleadoPorContrato("Pedro", 2500);

        // Imprimir datos de los empleados
        imprimirDatos(empleadoTiempoCompleto);
        imprimirDatos( EmpleadoPorHoras);
        imprimirDatos(EmpleadoPorContrato);
    }

    private static void imprimirDatos(EmpleadoTiempoCompleto empleadoTiempoCompleto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class EmpleadoTiempoCompleto {

        public EmpleadoTiempoCompleto() {
        }

        private EmpleadoTiempoCompleto(String juan, int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static abstract class EmpleadoPorHoras extends Empleado {

        public EmpleadoPorHoras(String maria, int i, int i0) {
        }
    }

    public class clase_empleado {
      // abstract empleados    
abstract class Empleado {
    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // metodo abstracto para calcular el salario mensual 
    public abstract double calcularSalarioAnual();

    // Get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
    
  
    private static void imprimirDatos(EmpleadoTiempoCompleto empleadoTiempoCompleto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Empleado {

        public Empleado() {
        }

        private String getNombre() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String calcularSalarioAnual() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class EmpleadoTiempoCompleto {

        public EmpleadoTiempoCompleto() {
        }

        private EmpleadoTiempoCompleto(String juan, int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}