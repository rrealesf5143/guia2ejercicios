/**
 * @Autor: Ronald Reales rrealesf5143@universidadean.edu.co 
 * Programa para un avión
 *
 */
package taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {

    //Declaración de variables
    static int clase, numPasajeros;
    static Double totalRecolectado = 0.0;

    //Clases o divisiones
    static final double CLASE1 = 500000;
    static final double CLASE2 = 200000;
    static final double CLASE3 = 125000;

    public static void main(String[] args) throws IOException {

        //Buffer para entrada de datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Validación de datos ingresados con try/catch
        try {

            System.out.println("EJERCICIO 5: PROGRAMA PARA UN AVION");
            System.out.println("-------------------------");

            //Ingreso de variables
            System.out.println("Ingrese la clase 1, 2 o 3:");
            clase = Integer.parseInt(br.readLine());
            System.out.println("Ingresar numero de pasajeros que compraron tiquetes para clase " + clase + ":");
            numPasajeros = Integer.parseInt(br.readLine());

            //Determinar total recolectado por aerolinea
            determinarTotalRecolectado(clase, numPasajeros);

            //Mostrar excepcion si algun dato es incorrecto
        } catch (NumberFormatException nfe) {
            System.err.println("Valor ingresado valido");
        }
    }

    public static void determinarTotalRecolectado(int clase, int numPasajeros) {

        System.out.println("-------------------------");
        switch (clase) {
            case 1:
                totalRecolectado = numPasajeros * CLASE1;
                break;
            case 2:
                totalRecolectado = numPasajeros * CLASE2;
                break;
            case 3:
                totalRecolectado = numPasajeros * CLASE3;
                break;
            default:
                System.out.println("Clase no valida");
                break;
        }

        System.out.println("Clase: " + clase);
        System.out.println("Numero de pasajeros: " + numPasajeros);
        System.out.println("TOTAL RECOLECTADO:" + totalRecolectado);
        System.out.println("-------------------------");

    }

}
