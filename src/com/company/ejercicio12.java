package com.company;

import java.util.Scanner;
import java.util.Stack;

public class ejercicio12 {


    public static void main (String[] args){
        //definir limite, contadorparalaSuma, validadorDeImpares
        int limiteNumero, sumaTotal = 0;
        boolean verificarImpar;
        Stack<Integer> impar = new Stack<>();

        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar numero limite");
        limiteNumero = leer.nextInt();

        System.out.print("multiplos de 5:");
        for (int i= 5; i < limiteNumero; i = i + 5){
            System.out.print(" " + i);
            //validar numero impares
            verificarImpar = (i%2 != 0)? true : false;
            if (verificarImpar)
                impar.push(i);
        }
        System.out.printf("%n" + "numeros impares:");
        for (int valor: impar) {
            //sumar los valores impares
            sumaTotal += valor;
            System.out.print(" " + valor);
        }
        System.out.printf( "%n" + "suma total: " + sumaTotal);
    }
}