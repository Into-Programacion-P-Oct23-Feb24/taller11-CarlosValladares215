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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] nota = new double[4];
        String notaCualitativa;
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Ingrese una nota");
            nota[i] = entrada.nextDouble();
        }
        notaCualitativa = promedioCualitativo(nota[0], nota[1], nota[2], nota[3]);

        System.out.printf("%s", notaCualitativa);
    }

    public static String promedioCualitativo(double n1, double n2, double n3, double n4) {
        String valorCualtivativo;
        double res;
        res = (n1 + n2 + n3 + n4) / 4.0;
        if (res >= 9.1) {
            valorCualtivativo = "Sobresaliente";
        } else {
            if (res >= 8.1) {
                valorCualtivativo = "Muy Bueno";
            } else {
                if (res >= 5.1) {
                    valorCualtivativo = "Bueno";
                } else {
                    valorCualtivativo = "Regular";
                }

            }
        }
        valorCualtivativo = String.format("El promedio de las notas:"
                + " %.0f, %.0f, %.0f %.0f es %s\n", n1, n2, n3, n4,
                 valorCualtivativo);
        return valorCualtivativo;
    }

}
