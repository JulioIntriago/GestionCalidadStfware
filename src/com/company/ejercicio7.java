package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ejercicio7{

    public static void main(String[] args){

        Integer guardNumeros[];
        int cantNumeros;
        System.out.println("¿cuantos numeros ingresaras?");
        Scanner scanner = new Scanner(System.in);
        cantNumeros = scanner.nextInt();
        guardNumeros = new Integer[cantNumeros];
        for (int contador = 0; contador < guardNumeros.length; contador++){

            System.out.println("ingresar valores enteros " + (contador + 1));
            guardNumeros[contador] = scanner.nextInt();
        }
        System.out.printf("numeros mayores de 10 son: ");
        for (int valores: guardNumeros) {
            if (valores > 10)
                System.out.printf(" " + valores);
        }
    }
}