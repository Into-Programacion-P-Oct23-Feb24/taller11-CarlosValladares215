/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {

        double media;
        double desviacionEstandar;
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        media = calculadorMediaAritmetica(informacion);
        desviacionEstandar = desviacionEstandar(informacion, media);

        System.out.printf("La media aritmética del arreglo es: %.2f\n"
                + "El valor de la desviación estándar del arreglo es: %.2f\n",
                 media, desviacionEstandar);

    }

    public static double calculadorMediaAritmetica(int[] informacion) {
        int suma = 0;
        double media;

        for (int e = 0; e < informacion.length; e++) {
            suma = suma + informacion[e];
        }

        media = (double) suma / informacion.length;

        return media;
    }

    public static double desviacionEstandar(int[] informacion, double media) {
        double[] diferencia = new double[informacion.length];
        double[] potencia = new double[informacion.length];
        double suma = 0;
        double mediaCuadrados;
        double desviacionEstandar;

        // Se calcula la resta de cada elemento del arreglo
        for (int e = 0; e < informacion.length; e++) {
            diferencia[e] = informacion[e] - media;
        }

        // Se eleva al cuadrado cada elemento del arreglo
        for (int e = 0; e < informacion.length; e++) {
            potencia[e] = Math.pow(diferencia[e], 2);
        }

        // Se calcula la media de los cuadrados del arreglo
        for (int e = 0; e < informacion.length; e++) {
            suma = suma + potencia[e];
        }

        mediaCuadrados = suma / potencia.length;

        // Se realiza la desviacion estandar
        desviacionEstandar = Math.sqrt(mediaCuadrados);

        return desviacionEstandar;
    }
}
