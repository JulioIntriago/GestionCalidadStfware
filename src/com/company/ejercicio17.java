package com.company;

import java.util.Scanner;

public class ejercicio17 {



    public static void main(String[] args){

        Integer cantidadTramos;
        int minutosTramo, cantidadMinutos = 0;
        Integer[] tramos;
        System.out.println("ingresar cantidad de tramos");
        Scanner scanner = new Scanner(System.in);
        cantidadTramos = scanner.nextInt();
        tramos = new Integer[cantidadTramos];
        for (int contador= 0; contador < tramos.length ; contador++){

            System.out.println("ingrse minutos recorridos en el tramo " + (contador + 1));
            minutosTramo = scanner.nextInt();
            tramos[contador] = minutosTramo;
        }
        for (Integer minuto: tramos) {

            cantidadMinutos += minuto;
        }
        System.out.println(cantidadMinutos / 60 + "horas con " + cantidadMinutos % 60 + " minutos");
    }
}