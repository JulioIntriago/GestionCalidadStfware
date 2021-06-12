package com.company;

import java.util.Scanner;

public class ejercicio18 {



    public static  void main (String[] args){

        int dadoA , dadoB, resulDados;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar el valor del dado A");
        dadoA = leer.nextInt();
        System.out.println("ingresar el  valor del dado B");
        dadoB = leer.nextInt();
        resulDados = dadoA + dadoB;

        if (dadoA >= 1 && dadoB <= 6){
            for (int contador = 1; contador < resulDados ; contador++){
                for (int contadorB = resulDados ; contadorB >= 1 ; contadorB -- ){

                    if ((contadorB + contador) == resulDados){
                        System.out.printf("" + contador + " + " + contadorB + " = " + resulDados + "%n"  );
                    }
                }
            }
        }

    }
}
