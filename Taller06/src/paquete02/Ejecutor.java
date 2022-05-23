/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete02;

import java.util.Scanner;
import paquete01.Ciudad;
import paquete01.Hospital;
import paquete01.Enfermeros;
import paquete01.Medicos;

/**
 *
 * @author ronni
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        // Variables String
        String nombreHospital;
        String ciudad;
        String provincia;
        String [] nombreMedico;
        String [] especialidadMedico;
        String [] nombreEnfermero;
        String [] tipoEnfermero;
        String direccion;
        // Variables enteras
        // int banderin;
        int enfInfo;
        int medInfo;
        double sueldosMedicos[];
        double sueldoEnfermeros[];

        System.out.println("Vamos a Ingresar datos para organizar la\n"
                + "información de los Hospitales en el Ecuador\n"
                + "---------------------------------------------------");
        //System.out.println("¿De cuántos hospitales desea ingresar información?");
        // banderin = a.nextInt();   
        // for (int i = 0; i < banderin; i++) {
            System.out.println("Ingrese el nombre de la ciudad en donde se\n"
                    + "encuentra el Hospital:");
            ciudad = a.nextLine();
            System.out.println("Ingrese la Provincia a la que pertenece el Hospital:");
            provincia = a.nextLine();
            System.out.println("Ingrese la dirección del hospital:");
            direccion = a.nextLine();
            System.out.println("Ingrese el nombre del Hospital: ");
            nombreHospital = a.nextLine().toUpperCase();
            Ciudad ciu = new Ciudad(ciudad, provincia, direccion);
            System.out.println("Información de Médicos"
                    + "\n--------------------------------");
            System.out.println("¿De cuántos médicos desea ingresar la información?");
            medInfo = a.nextInt();
            sueldosMedicos = new double[medInfo];
            nombreMedico = new String[medInfo];
            especialidadMedico = new String[medInfo];
            a.nextLine();
            for (int j = 0; j < medInfo; j++) {
                System.out.printf("Nombre del Médico %d:\n", j+1);
                nombreMedico [j]= a.nextLine();
                System.out.println("Ingresar la especialidad del médico: ");
                especialidadMedico[j] = a.nextLine();
                System.out.println("Ingrese el sueldo del médico especialista: ");
                sueldosMedicos[j] = a.nextDouble();
                a.nextLine();

            }
            Medicos med = new Medicos(nombreMedico, especialidadMedico,
                    sueldosMedicos);

            System.out.println("¿De cuántos enfermeros desea ingresar información?");
            enfInfo = a.nextInt();
            a.nextLine();
            sueldoEnfermeros = new double[enfInfo];
            nombreEnfermero = new String [enfInfo];
            tipoEnfermero = new String [enfInfo];
            for (int j = 0; j < enfInfo; j++) {
                System.out.println("Información de Enfermeros/as"
                        + "\n--------------------------------");
                System.out.printf("Nombre del Enfermero/a %d:\n", j+1);
                nombreEnfermero[j] = a.nextLine();
                System.out.println("Ingresar el tipo de contrato del enfermero/a: ");
                tipoEnfermero [j] = a.nextLine();
                System.out.println("Ingrese el sueldo del enfermero/a: ");
                sueldoEnfermeros[j] = a.nextDouble();
                a.nextLine();
             
            }
            

            Enfermeros enf = new Enfermeros(nombreEnfermero, tipoEnfermero,
                    sueldoEnfermeros);

            Hospital hos = new Hospital(nombreHospital, ciu, med, enf);
            hos.establecerNumeroEspecialidades(medInfo, enfInfo);
            hos.establecerSueldosTotales(sueldosMedicos, sueldoEnfermeros);
            System.out.printf("------------------------------------\n%s", hos);
        }     
    }

