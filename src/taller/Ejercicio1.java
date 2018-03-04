package taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Autor: Ronald Reales rrealesf5143@universidadean.edu.co 
 * usando NetBeans
 * Tronco de Pirámide
 * Formula de Área de pirámide sacada de: http://www.universoformulas.com/matematicas/geometria/area-tronco-piramide/
 */
public class Ejercicio1 {

    public static void main(String[] args) throws IOException {

        //Buffer para entrada de datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Declaración de variables de cuadrado superior:
        double b, S2;
        //Declaración de variables de cuadrado inferior:
        double B, S1;
        //Altura y volumen
        double h, Ap, A, V;

        //Validación de datos ingresados con try/catch
        try {

            System.out.println("EJERCICIO 1: TRONCO DE PIRAMIDE");
            System.out.println("-------------------------");

            //Ingreso de variables
            System.out.println("Ingresar altura (h):");
            h = Double.parseDouble(br.readLine());
            System.out.println("Ingresar lado del cuadrado inferior (B):");
            B = Double.parseDouble(br.readLine());
            System.out.println("Ingresar lado del cuadrado superior (b):");
            b = Double.parseDouble(br.readLine());
            System.out.println("Ingresar apotema (Ap):");
            Ap = Double.parseDouble(br.readLine());

            System.out.println("-------------------------");
            //AREA
            //Area de cuadrado inferior
            S1 = B*B;
            //Area de cuadrado superior
            S2 = b*b;
            //Area de tronco de piramide
            A = S1 + S2 + ((4*B + 4*b)/2)*Ap;
            System.out.println("Area de tronco de piramide (A): " + A);

            //VOLUMEN
            V = (h/3)*(S1 + S2 + ((float) Math.sqrt(S1*S2)));
            System.out.println("Volumen de tronco de piramide (V): " + V);                      

            System.out.println("-------------------------");

            //Mostrar excepcion si algun dato es incorrecto
        } catch (NumberFormatException nfe) {
            System.err.println("Valor ingresado valido");
        }
    }
}
