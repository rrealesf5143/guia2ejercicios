package taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Autor: Ronald Reales rrealesf5143@universidadean.edu.co 
 * Area de Hexágono
 */
public class Ejercicio6 {

    public static void main(String[] args) throws IOException {

        //Buffer para entrada de datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Declaración de variables
        double L;
        double ap;
        double area;

        //Validación de datos ingresados con try/catch
        try {
            
            System.out.println("EJERCICIO 6: AREA DE HEXAGONO");
            System.out.println("-------------------------");
            
            //Ingreso de variables
            System.out.println("Ingresar lado (L):");
            L = Double.parseDouble(br.readLine());
            System.out.println("Ingresar apotema (ap):");
            ap = Double.parseDouble(br.readLine());

            //Mostrar variables ingresadas
            System.out.println("-------------------------");
            System.out.println("L: " + L);
            System.out.println("ap: " + ap);
            
            //Calculo de área de hexágono
            area = (6*L*ap)/2;
            System.out.println("El area del hexagono es: " + area);
            System.out.println("-------------------------");

        //Mostrar excepcion si algun dato es incorrecto
        } catch (NumberFormatException nfe) {
            System.err.println("Valor ingresado valido");
        }

    }

}
