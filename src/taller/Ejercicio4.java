/**
 * @Autor: Ronald Reales rrealesf5143@universidadean.edu.co 
 * Paseo a Melgar
 *
 */
package taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {

    //Declaración de variables
    static int numGordos, numFlacos, numSillasBus, personasPorHabitacion, numDiasPaseo;
    static Double valorPlatoComida, valorHabitacionHotel, precioBus, costoTotalBuses, costoTotalHabitacionesDiario, costoTotalHabitacionesViaje;

    static final int FLACO = 1;
    static final int GORDO = 2;
    static final int PLATOS_POR_FLACO = 3;
    static final int PLATOS_POR_GORDO = 5;
    static final double IDA_Y_REGRESO = 2;

    public static void main(String[] args) throws IOException {

        //Buffer para entrada de datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Validación de datos ingresados con try/catch
        try {

            System.out.println("EJERCICIO 4: PASEO A MELGAR");
            System.out.println("-------------------------");

            //Ingreso de variables
            System.out.println("Ingrese numero de estudiantes gordos:");
            numGordos = Integer.parseInt(br.readLine());
            System.out.println("Ingrese numero de estudiantes flacos:");
            numFlacos = Integer.parseInt(br.readLine());
            System.out.println("Ingrese numero de sillas por bus:");
            numSillasBus = Integer.parseInt(br.readLine());
            System.out.println("Ingresar valor de plato de comida:");
            valorPlatoComida = Double.parseDouble(br.readLine());
            System.out.println("Ingresar valor de habitacion de hotel:");
            valorHabitacionHotel = Double.parseDouble(br.readLine());
            System.out.println("Ingrese numero de personas que caben por habitacion:");
            personasPorHabitacion = Integer.parseInt(br.readLine());
            System.out.println("Ingresar el precio por alquilar un bus:");
            precioBus = Double.parseDouble(br.readLine());
            System.out.println("Ingrese el numero de dias del paseo:");
            numDiasPaseo = Integer.parseInt(br.readLine());

            //Determinar totales
            determinarCostosBuses(numGordos, numFlacos, numSillasBus, precioBus);
            determinarCostosHotel(numGordos, numFlacos, personasPorHabitacion, valorHabitacionHotel, valorPlatoComida, numDiasPaseo);

            //Mostrar excepcion si algun dato es incorrecto
        } catch (NumberFormatException nfe) {
            System.err.println("Valor ingresado valido");
        }
    }

    public static void determinarCostosBuses(int numGordos, int numFlacos, int numSillasBus, Double precioBus) {

        int totalAsientos = numGordos * GORDO + numFlacos * FLACO;

        //Cantidad de buses con carga al 100%
        int cantidadDeBuses = (int) totalAsientos / (int) numSillasBus;

        //Determinar si se necesita un bus adicional para residuo de estudiantes
        float residuoEstudiantes = totalAsientos % numSillasBus;
        if (residuoEstudiantes > 0) {
            cantidadDeBuses++;
        }

        //Determinar cuánto dinero nos cuesta alquilar esos buses
        costoTotalBuses = precioBus * cantidadDeBuses * IDA_Y_REGRESO;

        //System.out.println("Residuo" + residuoViajes );
        System.out.println("-------------------------");
        System.out.println("RESULTADOS:");
        System.out.println("Cantidades de buses a utilizar: " + cantidadDeBuses);
        System.out.println("Costo total de alquiler de buses: " + costoTotalBuses);

    }

    public static void determinarCostosHotel(int numGordos, int numFlacos, int personasPorHabitacion, Double valorHabitacionHotel, Double valorPlatoComida, int numDiasPaseo) {

        //Total de comida
        double totalComidaViaje = (double) valorPlatoComida * (double) (numGordos * PLATOS_POR_GORDO + numFlacos * PLATOS_POR_FLACO) * (double) (numDiasPaseo);

        int totalPersonas = numGordos + numFlacos;

        //Cantidad de buses con carga al 100%
        int cantidadDeHabitaciones = (int) totalPersonas / (int) personasPorHabitacion;

        //Determinar si se necesita un bus adicional para residuo de estudiantes
        float residuoPersonas = totalPersonas % personasPorHabitacion;
        if (residuoPersonas > 0) {
            cantidadDeHabitaciones++;
        }

        //Valor a pagar por las habitaciones del hotel diario
        costoTotalHabitacionesDiario = cantidadDeHabitaciones * valorHabitacionHotel;

        //Valor a pagar por las habitaciones del hotel en total por el viaje
        costoTotalHabitacionesViaje = costoTotalHabitacionesDiario * numDiasPaseo;

        //System.out.println("Residuo" + residuoViajes );
        System.out.println("Valor total a pagar por la comida: " + totalComidaViaje);
        System.out.println("Numero de habitaciones para que duerman estudiantes: " + cantidadDeHabitaciones);
        System.out.println("Valor a pagar por las habitaciones del hotel diario: " + costoTotalHabitacionesDiario);
        System.out.println("Valor a pagar por las habitaciones del hotel en total por el viaje: " + costoTotalHabitacionesViaje);
        System.out.println("-------------------------");

    }

}
