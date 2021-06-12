package com.company;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        float   n1, n2, n3, n4;

        while (true) {

            System.out.println("Ingrese nota 1: ");
            n1 = lector.nextFloat();
            System.out.printf("Ingrese nota 2: ");
            n2 = lector.nextFloat();

            if (n1 > 0 && n1 <= 10 && n2 > 0 && n2 <= 10) {
                if (n1 < 2 && n2 < 2) {
                    System.out.println("Reprobado ");
                    break;
                }      if (n1 > 9 && n2 > 9) {
                    System.out.println("Aprobado ");
                    break;
                }
                System.out.println("Ingrese nota 3: ");
                n3 = lector.nextFloat();
                System.out.println("Ingrese examen: ");
                n4 = lector.nextFloat();
                if (n3 > 0 && n3 <= 10 && n4 > 0 && n4 <= 10) {
                    float total = (n1 + n2 + n3 + n4) / 4;
                    System.out.println("El promedio es:  " + total);
                    break;
                } else {
                    System.out.println("La nota debe estar entre  0 y 10 con 1 decimal");
                }

            } else {
                System.out.println("La nota debe estar entre  0 y 10 con 1 decimal");

            }

        }

    }
}
