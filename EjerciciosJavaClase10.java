/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjavaclase10;

import java.util.Scanner;

/**
 *
 * @author alann
 */
public class EjerciciosJavaClase10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //serieCuadrada();
        
        tableroAjedrez();
        
    }
    
    public static void serieCuadrada(){
        
        // Declaracion de Scanner
        Scanner sc = new Scanner (System.in);
        
        // Declaracion de variables
        int pow = 0;
        Integer num;
        
        // Titulo de ejercicio
        System.out.println("---------------------------");
        System.out.println("Serie al cuadrado");
        System.out.println("---------------------------");
        
        // Introduccion del numero para la serie
        System.out.print("Introduce el numero limite de la serie al cuadrado: ");
        num = sc.nextInt();
        
        // Ciclo para solicitar un numero en caso de que no se ingrese
        while(num <= 0){
            System.out.print("Debes introducir un numero entero positivo: ");
            num = sc.nextInt();
        }
        
        // Cierre de Scanner
        sc.close();
        
        System.out.println("Serie de numeros hasta el '" + num + "': ");
        
        for(int i = 1; i<=num; i++){
            if(i == num){
               System.out.println(i + "."); 
            }else{  
            System.out.print(i + ", ");
            }
        }
        
        
        System.out.println("Serie de numeros al cuadrado: ");
        
        // Ciclo para potenciar
        for(int j = 1; j <= num; j++){
            pow = j * j;
            if(j == num){
               System.out.println(pow + "."); 
            }else{  
            System.out.print(pow + ", ");
            }
        }
        
    }
    
    
    
    
    
    public static void tableroAjedrez(){
        
        // Declaracion de Scanner
        Scanner sc = new Scanner (System.in);
        
        // Declaracion de variables
        int num;
        
        // Titulo de ejercicio
        System.out.println("---------------------------");
        System.out.println("Tablero de ajedrez");
        System.out.println("---------------------------");
        
        // Introduccion del numero para la serie
        System.out.print("Introduce el numero para el tamano del tablero: ");
        num = sc.nextInt();
        
        // Ciclo para solicitar un numero en caso de que no se ingrese
        while(num <= 0){
            System.out.print("Por favor introduce un numero entero positivo: ");
            num = sc.nextInt();
        }
        
        // Cierre de Scanner
        sc.close();
        
        //Ciclo for para el tablero
        for(int i = 1; i <= num; i++){
            if(i%2 == 0){
                //Ciclo para cada linea par del tablero
                for(int j = 1; j <= num; j++){
                    if(j%2 == 0){
                        System.out.print("|#|");
                    }else{
                        System.out.print("|_|");
                    } 
                }
            } else{
                //Ciclo para cada linea impar del tablero
                for(int j = 1; j <= num; j++){
                    if(j%2 == 0){
                        System.out.print("|_|");
                    }else{
                        System.out.print("|#|");
                    }
                }
            }
            System.out.println("");
        }
        
    }
    
}
