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
class EmpleadoPorHoras {
    class EmpleadoPorHoras extends EmpleadoPorHoras {
    private double salarioPorHora;

    public EmpleadoPorHoras(String nombre, double salarioBase, double salarioPorHora) {
        super(nombre, salarioBase);
        this.salarioPorHora = salarioPorHora;
    }

    public double calcularSalarioAnual() {
        // Por simplicidad, asumimos 160 horas trabajadas al mes
        return calcularSalarioMensual(160) * 12;
    }

    public double calcularSalarioMensual(int horasTrabajadas) {
        // Salario base + salario por hora * horas trabajadas
        return getSalarioBase() + salarioPorHora * horasTrabajadas;
    }
}
}
