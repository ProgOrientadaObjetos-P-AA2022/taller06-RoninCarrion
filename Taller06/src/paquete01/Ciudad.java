/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author ronni
 */
public class Ciudad {

    String nombreCiudad;
    String provinciaCiudad;
    String direccion;

    public Ciudad(String a, String b, String c) {
        nombreCiudad = a;
        provinciaCiudad = b;
        direccion = c;
    }

    public void establecerNombreCiudad(String a) {
        nombreCiudad = a;
    }

    public void establecerProvinciaCiudad(String a) {
        provinciaCiudad = a;
    }
    public void establecerDireccion(String a ){
        direccion = a;
    
    }

    //--------------------------------
    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerProvinciaCiudad() {

        return provinciaCiudad;
    }
        public String obtenerDireccion(){
        return direccion;
    
    }
}
