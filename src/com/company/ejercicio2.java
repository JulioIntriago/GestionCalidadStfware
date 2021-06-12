package com.company;

import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int metros,decimetros,pulgadas,pies;
        int opcion;

        double resultado;
        System.out.println("MENU...");
        System.out.println("Digite el numero a convertir en centimetros :");
        System.out.println("1.- Metros");
        System.out.println("2.- Decimetros");
        System.out.println("3.- Pulgadas");
        System.out.println("4.- Pies");

        System.out.println("Ingrese su opción:");

        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor");
                metros = leer.nextInt();
                resultado = metros * 100;
                System.out.println("El resultado es: " + resultado + " metros");
                break;
            case 2:
                System.out.println("Ingrese el valor");
                decimetros = leer.nextInt();
                resultado = decimetros * 0.1;
                System.out.println("El resultado es: " + resultado + " decimetros");
                break;
            case 3:
                System.out.println("Ingrese el valor");
                pulgadas = leer.nextInt();
                resultado = pulgadas * 2.54;
                System.out.println("El resultado es: " + resultado + " pulgadas");
                break;
            case 4:
                System.out.println("Ingrese el valor");
                pies = leer.nextInt();
                resultado = pies * 30.48;
                System.out.println("El resultado es: " + resultado + " pies");
                break;

        }
    }
}