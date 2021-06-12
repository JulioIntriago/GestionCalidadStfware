package com.company;
import java.util.Scanner;
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero, resultado = 0;
        while (true) {
            System.out.println("Ingrese un numero mayor a 10 para calcular la serie: ");
            numero = lector.nextInt();
            if (numero > 10) {
                for (int i = 1; i <= numero; i++) {
                    resultado += Math.pow(i, (i));

                    if (i < numero) {

                        System.out.print("(" + i + ")" + 2 + " + ");
                    } else {
                        System.out.print("(" + i + ")" + 2 + " = " + resultado+"\n");

                    }
                }   break;

            } else {
                System.out.println("El numero debe ser mayor a 10");
            }
        }
    }

}
