/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author ronni
 */
public class Medicos {
    String []nombreDoctor;
    String []especialidad;
    double [] sueldoMensual;

    public Medicos(String []a, String[] b, double[] sueldo) {
        nombreDoctor = a;
        especialidad = b;
        sueldoMensual = sueldo;
    }
    // Establecer---------------------
    
    public void establecerNombreDoctor(String []a) {
        nombreDoctor = a;
    }

    public void establecerEspecialidad(String [] a) {
        especialidad = a;
    }

    public void establecerSueldoMensual(double [] a) {
        sueldoMensual = a;
    }
    // Obtener-----------------
        public String [] obtenerNombreDoctor() {
        return nombreDoctor;
    }

    public String [] obtenerEspecialidad() {
        return especialidad;
    }

    public double [] obtenerSueldoMensual() {
        return sueldoMensual;
    }
}
