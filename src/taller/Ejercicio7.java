package taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *@Autor: Ronald Reales rrealesf5143@universidadean.edu.co 
 * Propiedades de Triángulo
 * usando NetBeans
 */
public class Ejercicio7 {

    public static void main(String[] args) throws IOException {

        //Buffer para entrada de datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Declaración de variables
        //Lados
        double a, b, c;
        //Semiperímetro, Área y Circumradius
        double s, A, R;

        //Validación de datos ingresados con try/catch
        try {

            System.out.println("EJERCICIO 7: PROPIEDADES DE TRIANGULO");
            System.out.println("-------------------------");

            //Ingreso de variables
            System.out.println("Ingresar lado a (a):");
            a = Double.parseDouble(br.readLine());
            System.out.println("Ingresar lado b (b):");
            b = Double.parseDouble(br.readLine());
            System.out.println("Ingresar lado c (c):");
            c = Double.parseDouble(br.readLine());

            //Mostrar variables ingresadas
            System.out.println("-------------------------");
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("c: " + c);

            //Calculo del Semiperímetro
            s = (a + b + c) / 2;
            System.out.println("El semiperimetro es: " + s);

            //Calculo del Área
            //Si s es igual a algun lado, la formula da 0
            A = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("El area es: " + A);

            //Calculo del Circumradius
            //Se reemplaza A en el denominador
            R = (a * b * c) / (4 * Math.PI * A);
            System.out.println("El circumradius es: " + R);
            System.out.println("-------------------------");

            //Mostrar excepcion si algun dato es incorrecto
        } catch (NumberFormatException nfe) {
            System.err.println("Valor ingresado valido");
        }

    }

}
