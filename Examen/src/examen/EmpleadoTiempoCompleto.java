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
public class EmpleadoTiempoCompleto {

    private static class Empleado {

        public Empleado() {
        }
    }
    // Clase EmpleadoTiempoCompleto
    class EmpleadoTiempoCompleto extends Empleado {
       public EmpleadoTiempoCompleto(String nombre, double salarioBase) {
          super(nombre, salarioBase);
    }

    
    public double calcularSalarioAnual() {
        // Salario mensual * 12 + bono anual del 10%
        return getSalarioBase() * 12 * 1.1;
    }

        private int getSalarioBase() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
