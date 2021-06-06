/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uees.poo.registro3.Guia8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author giama
 */
public class EjerEceptMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int num[]; 
        num = new int[2];
        
        try{
            
            for(int i=0; i<=1; i++){
                System.out.print("Ingrese un valor entero:");
                num[i] = teclado.nextInt();
                
            }
            
            System.out.println(num[0] + " + " + num[1] + " = " + (num[0] + num[1]));
            
        } catch (InputMismatchException ex){
            System.out.println("Debe ingresar por obligación un número entero.");
        } finally {
            System.out.println("Gracias por usar.");
        }
    } 
}
