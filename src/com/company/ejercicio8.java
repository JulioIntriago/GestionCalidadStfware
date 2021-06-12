/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
package com.company;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero, resultado = 0;
        while (true) {
            System.out.println("Ingrese el numero de la serie: ");
            numero = lector.nextInt();
            if (numero > 0 && numero > 10) {
                System.out.println("Correcto ");
                for (int i = 1; i <= numero; i++) {

                    if (i % 3 != 0 && i % 5 != 0) {
                        System.out.println("El resultado de la serie en: " + i);
                    }

                }

                {
                    break;
                }
            } else {
                System.out.println("El numero debe ser mayor a 10");

            }

        }
    }

}
