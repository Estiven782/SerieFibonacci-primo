/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci2;

import java.util.Scanner;

/**
 *
 * @author Estiven
 */
public class Seriefibonacci2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        int numero;
        int fibo1;
        int fibo2;
        int i;
        int contador=0;
        
        
        do{
        
            System.out.println("Ingrese un número mayor que 1: ");
            numero = sc.nextInt();
        }
        while(numero<=1);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");
        fibo1 = 0;
        fibo2 = 1;
        
        System.out.println(fibo1 + " ");
        
        for(i=1;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
            
            if(numero%i==0){
                contador++;
            }
        
        }
        
        if(contador==2){
            System.out.println("El número es primo");     
        }
        else{
            System.out.println("El número no es primo");
            } 
        }
    }
    
   