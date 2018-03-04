package taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Autor: Ronald Reales rrealesf5143@universidadean.edu.co 
 * Volumen de tronco de cono Segun los datos: (Volumen de cono completo) - (Volumen de cono deficiente)
 * Formula de Volumen: http://www.universoformulas.com/matematicas/geometria/volumen-tronco-cono/
 */
public class Ejercicio3 {

    public static void main(String[] args) throws IOException {

        //Buffer para entrada de datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Declaración de variables de cono completo:
        double h1, r1, A1, V1;
        //Declaración de variables de cono deficiente:
        double h2, r2, A2, V2;
        //Volumen de cono truncado
        double V;

        //Validación de datos ingresados con try/catch
        try {

            System.out.println("EJERCICIO 3: VOLUMEN DE TRONCO DE CONO");
            System.out.println("-------------------------");

            //Ingreso de variables
            System.out.println("Ingresar altura de cono completo (h1):");
            h1 = Double.parseDouble(br.readLine());
            System.out.println("Ingresar radio de base de cono completo (r1):");
            r1 = Double.parseDouble(br.readLine());
            System.out.println("Ingresar altura de cono deficiente (h2):");
            h2 = Double.parseDouble(br.readLine());
            System.out.println("Ingresar radio de base de cono deficiente (r2):");
            r2 = Double.parseDouble(br.readLine());

            System.out.println("-------------------------");
            //VOLUMEN CONO COMPLETO
            A1 = Math.PI * Math.pow(r1, 2);
            V1 = A1 * h1;
            System.out.println("Volumen de cono completo (V1): " + V1);

            //VOLUMEN CONO DEFICIENTE
            A2 = Math.PI * Math.pow(r2, 2);
            V2 = A2 * h2;
            System.out.println("Volumen de cono deficiente (V2): " + V2);

            //VOLUMEN DE TRONCO DE CONO
            V = V1 - V2;
            System.out.println("Volumen de tronco de cono V = V1 - V2");
            System.out.println("V: " + V);

            System.out.println("-------------------------");

            //Mostrar excepcion si algun dato es incorrecto
        } catch (NumberFormatException nfe) {
            System.err.println("Valor ingresado valido");
        }
    }
}
