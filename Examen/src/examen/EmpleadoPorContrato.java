/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;

/**
 *
 * @author invitado
 */
public class EmpleadoPorContrato {

    EmpleadoPorContrato(String pedro, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Empleado {

        public Empleado() {
        }
    }
    // Clase EmpleadoPorContrato
    class EmpleadoPorContrato extends empleado {
        public EmpleadoPorContrato(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

   
    public double calcularSalarioAnual() {
        // Salario mensual * 12
        return getSalarioBase() * 12;
    }

        private int getSalarioBase() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
}

