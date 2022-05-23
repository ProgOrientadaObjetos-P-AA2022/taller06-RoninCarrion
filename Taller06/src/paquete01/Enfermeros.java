/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author ronni
 */
public class Enfermeros {

    String [] nombreEnfermero;
    String [] tipo;
    double [] sueldoMensual;

    public Enfermeros(String [] a, String []b, double [] sueldo) {
        nombreEnfermero = a;
        tipo = b;
        sueldoMensual = sueldo;
    }
    // Establecer---------------------
    
    public void establecerNombreEnfermero(String [] a) {
        nombreEnfermero = a;
    }

    public void establecerTipo(String [] a) {
        tipo = a;
    }

    public void establecerSueldoMensual(double [] a) {
        sueldoMensual = a;
    }
    // Obtener-----------------
        public String [] obtenerNombreEnfermero() {
        return nombreEnfermero;
    }

    public String [] obtenerTipo() {
        return tipo;
    }

    public double [] obtenerSueldoMensual() {
        return sueldoMensual;
    }
}
