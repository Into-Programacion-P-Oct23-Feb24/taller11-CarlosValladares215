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
public class Problema5 {
    public static void main(String[] args) {
        
        int sumaTotal;
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        
        sumaTotal = sumadorDeNumeros(informacion);
        
        System.out.printf("%s\n",sumaTotal);
    }
    
    public static int sumadorDeNumeros(int [][] informacion){
        int suma = 0;
        for(int f = 0; f<informacion.length;f++){
            for (int c = 0; c<informacion[f].length;c++){
                suma = suma + informacion[f][c];
            }
        }
        return suma;
    }
}
