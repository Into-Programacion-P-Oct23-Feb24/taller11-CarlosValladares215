/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {
    public static void main(String[] args) {
        String [] ciudadesEcuador = recolectorDatos();
        identificadorCadenas(ciudadesEcuador);
    }
    
    public static String[] recolectorDatos(){
        Scanner entrada = new Scanner(System.in);
        
        int n;
        
        System.out.println("Ingrese el numero de elementos del arreglo");
        n = entrada.nextInt();
        String [] ciudades = new String [n];
        entrada.nextLine();
        
        for(int e = 0;e<ciudades.length;e++){
            System.out.println("Ingrese una ciudad del Ecuador");
            ciudades[e] =  entrada.nextLine();
        }
        
        return ciudades;
    }
    
    public static void identificadorCadenas(String [] ciudadesEcuador){
        String ciudad;
        int [] contadorCadenas = new int[ciudadesEcuador.length];
        
        for(int e = 0; e<ciudadesEcuador.length;e++){
            ciudad = ciudadesEcuador[e];
            contadorCadenas[e] = ciudad.length();
        }
        
        System.out.println("\nLista de ciudades con 4 o 5 caracteres:");
        for(int e = 0; e<ciudadesEcuador.length;e++){
            if(contadorCadenas[e] == 4 || contadorCadenas[e] == 5){
                System.out.printf("%s\n",ciudadesEcuador[e]);
            }
        }
    }
    
}
