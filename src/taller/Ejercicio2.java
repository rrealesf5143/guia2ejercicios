/**
 * @Autor: Ronald Reales rrealesf5143@universidadean.edu.co 
 * Transporte de carga de Bogotá a Sasaima
 * usando NetBeans
 */
package taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

    public static void main(String[] args) throws IOException {

        //Declaración de variables de cuadrado superior:
        float carga, kilosPorViaje, galonesPorViaje;

        //Buffer para entrada de datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Validación de datos ingresados con try/catch
        try {

            System.out.println("EJERCICIO 2: TRANSPORTE DE CARGA DE BOGOTA A SASAIMA");
            System.out.println("-------------------------");

            //Ingreso de variables
            System.out.println("Ingresar la carga a transportar en kilos:");
            carga = Float.parseFloat(br.readLine());
            System.out.println("Ingresar kilos por viaje:");
            kilosPorViaje = Float.parseFloat(br.readLine());
            System.out.println("Ingresar galones por viaje:");
            galonesPorViaje = Float.parseFloat(br.readLine());

            determinarViajesDelcamion(carga, kilosPorViaje, galonesPorViaje);

            //Mostrar excepcion si algun dato es incorrecto
        } catch (NumberFormatException nfe) {
            System.err.println("Valor ingresado valido");
        }
    }

    public static void determinarViajesDelcamion(float carga, float kilosPorViaje, float galonesPorViaje) {
        
        //Cantidad de viajes con carga al 100%
        int cantidadDeViajes = (int) carga / (int) kilosPorViaje;
        
        //Determinar si se necesita un ultimo viaje para carga residual
        float residuoViajes = carga % kilosPorViaje;
        if (residuoViajes > 0) {
            cantidadDeViajes++;
        }
        
        //Galones utilizados para transportar toda la carga
        float galonesTotales = cantidadDeViajes * galonesPorViaje;

        //System.out.println("Residuo" + residuoViajes );
        System.out.println("-------------------------");
        System.out.println("RESULTADOS:");
        System.out.println("Cantidades de viajes para transportar toda la carga: " + cantidadDeViajes);
        System.out.println("Galones totales usados para transportar toda la carga: " + galonesTotales);
        System.out.println("-------------------------");

    }

}
