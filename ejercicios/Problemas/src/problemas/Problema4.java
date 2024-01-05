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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String cedula;
        int opcion;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su cédula");
        cedula = entrada.nextLine();

        System.out.println("Elija y digite el numero apartir de las "
                + "siguientes opciones:");
        System.out.println("1. Calcular plantilla de luz\n"
                + "2. Calcular el valor del predio de un inmueble");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            calcularValorLuz(nombre, cedula);
        } else {
            if (opcion == 2) {
                calcularPredio(nombre, cedula);
            } else {
                System.out.println("Error, escoja solo una de las dos"
                        + "opciones");
            }
        }
    }

    public static void calcularValorLuz(String cliente, String cedula) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double kilowatio;
        double kilowatiosMes;
        double valorCancelar;

        System.out.println("Ingrese el valor del kilowatio");
        kilowatio = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilowatios "
                + "consumidos en el mes");
        kilowatiosMes = entrada.nextDouble();

        valorCancelar = kilowatio * kilowatiosMes;

        System.out.printf("Cliente %s con cédula %s debe cancelar el "
                + "valor de $ %.0f\n", cliente, cedula, valorCancelar);
    }

    public static void calcularPredio(String cliente, String cedula) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double valorInmueble;
        double valorPredio;

        System.out.println("Ingrese el valor del inmueble");
        valorInmueble = entrada.nextDouble();

        valorPredio = (valorInmueble * 2) / 100;

        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble "
                + "valorado en $ %.0f y tiene que pagar de predio $ %.0f\n",
                cliente, cedula, valorInmueble, valorPredio);
    }
}
