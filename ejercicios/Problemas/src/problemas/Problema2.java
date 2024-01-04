/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion;
        System.out.println("Ingrese el numero segun la opcion que "
                + "se desee ejecutar");
        System.out.println("1. Calcular el área de un cuadrado"
                + "\n2. Calcular el área del triángulo"
                + "\n3. Calcular el área del rectángulo");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();
            } else {
                if (opcion == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("El numero ingresado debe estar en un "
                            + "rango de entre 1 a 3");
                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double area;
        double lado;
        System.out.println("Ingrese el lado del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado * lado * lado;
        System.out.printf("El área del cuadrado es: %.2f\n", area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double area;
        double base;
        double altura;
        System.out.println("Ingrese la base del triángulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triángulo");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("El área del triángulo es: %.2f\n", area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double area;
        double base;
        double altura;
        System.out.println("Ingrese la base del rectángulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectángulo");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf("El área del rectángulo es: %.2f\n",
                area);
    }
}
