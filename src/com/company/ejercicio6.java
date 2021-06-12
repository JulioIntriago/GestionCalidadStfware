package com.company;

import java.util.Scanner;
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double numero, resultado = 0;
        while (true) {
            System.out.println("Ingrese el numero 'n' de la serie: ");
            numero = lector.nextInt();
            if (numero > 0) {
                System.out.println("Resultado: ");
                for (int i = 1; i <= numero; i++) {
                    double N = i;
                    resultado += Math.pow((N / (N * 2)), (N));

                    if (N < numero) {

                        System.out.print("(" + i + "/" + (i * 2) + ")" + i + " + ");
                    } else {
                        System.out.print("(" + i + "/" + (i * 2) + ")" + i + " = " + resultado+"\n");

                    }
                }   break;

            } else {
                System.out.println("El numero ingresado debe ser mayor a 10");

            }

        }
    }
}