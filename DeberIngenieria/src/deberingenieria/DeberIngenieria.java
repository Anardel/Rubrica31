/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deberingenieria;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class DeberIngenieria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hola Profe :* ");
        
        Scanner s = new Scanner(System.in);
int numero1 = 0;
int numero2 = 0;
int resultado;

System.out.println("Introduce el primer número:");
numero1 = s.nextInt();

System.out.println("Introduce el segundo número:");
numero2 = s.nextInt();

resultado = numero1+numero2;

System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado ) ;

}

}

    

