/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocondicional;

import java.util.Scanner;

/**
 *
 * @author Abel
 */
public class EjercicioCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Este es un ejercicio que solicita por teclado dos números y muestre por pantalla el mayor. */
        Scanner teclado = new Scanner(System.in);

        float n;
        float n1;

        System.out.println("Introduzca numero");
        n = teclado.nextFloat();

        System.out.println("Introduzca numero");
        n1 = teclado.nextFloat();

        if (n > n1) {
            System.out.println("El mayor es: " + n);
        } else {
            System.out.println("El mayor es: " + n1);
        }
    }

}
