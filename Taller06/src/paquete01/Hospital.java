/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author ronni
 */
public class Hospital {

    String nombreHospital;
    Ciudad ciudadHospital;
    Medicos medicos;
    Enfermeros enfermeros;
    double sueldosTotales;
    int numeroEspecialidades;

    public Hospital(String a, Ciudad b, Medicos c, Enfermeros d) {
        nombreHospital = a;
        ciudadHospital = b;
        medicos = c;
        enfermeros = d;

    }

    public void establecerNombreHospital(String a) {
        nombreHospital = a;
    }

    public void establecerCiudadHospital(Ciudad a) {
        ciudadHospital = a;
    }

    public void establecerMedicos(Medicos a) {
        medicos = a;
    }

    public void establecerEnfermeros(Enfermeros a) {
        enfermeros = a;
    }

    public void establecerSueldosTotales(double[] a, double[] b) {
        double suma = 0;
        // double suma2 = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            suma += b[i];
        }
        sueldosTotales = suma;
    }

    public void establecerNumeroEspecialidades(int a, int b) {

        numeroEspecialidades = a + b;
    }

    // ----------------------------------------------------
    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public Ciudad obtenerCiudadHospital() {
        return ciudadHospital;
    }

    public Medicos obtenerMedicos() {
        return medicos;
    }

    public Enfermeros obtenerEnfermeros() {
        return enfermeros;
    }

    public double obtenerSueldosTotales() {
        return sueldosTotales;
    }

    public int obtenerNumeroEspecialidades() {

        return numeroEspecialidades;
    }

    @Override
    public String toString() {
        String stringFinal;
        String cadena1 = "";
        String cadena2 = "";

        for (int i = 0; i < obtenerMedicos().obtenerSueldoMensual().length; i++) {
            cadena1 = String.format("%s\n- %s - Sueldo: %.2f - %s", cadena1,
                    obtenerMedicos().obtenerNombreDoctor()[i],
                    obtenerMedicos().obtenerSueldoMensual()[i],
                    obtenerMedicos().obtenerEspecialidad()[i]);
        }
        for (int i = 0; i < obtenerEnfermeros().obtenerSueldoMensual().length; i++) {
            cadena2 = String.format("%s\n- %s - Sueldo: %.2f - %s", cadena2,
                    obtenerEnfermeros().obtenerNombreEnfermero()[i],
                    obtenerEnfermeros().obtenerSueldoMensual()[i],
                    obtenerEnfermeros().obtenerTipo()[i]);
        }
        stringFinal = String.format("%s\nDirección: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n"
                + "Listado de Médicos:%s\n"
                + "Listado de Enfermeros(as):%s\n"
                + "Total de sueldos a pagar por mes: $%.2f\n", obtenerNombreHospital(),
                obtenerCiudadHospital().obtenerDireccion(),
                obtenerCiudadHospital().obtenerNombreCiudad(),
                obtenerCiudadHospital().obtenerProvinciaCiudad(),
                obtenerNumeroEspecialidades(), cadena1, cadena2,
                obtenerSueldosTotales());

        return stringFinal;
    }
}
