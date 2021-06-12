package com.company;

import java.util.Scanner;

public class ejercicio19 {


    public static void main(String[] args) {
        char caracter;
        //Creamos un Scanner para ingresar el caracter
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");
        caracter=teclado.next().charAt(0);

        if (Character.isDigit(caracter)){
            System.out.println("El caracter ingresado es un digito");
        }else if(Character.isUpperCase(caracter)){
            System.out.println("Este caracter es una letra en mayuscula");
        }else if (Character.isLowerCase(caracter)){
            System.out.println("El caracter es una letra minuscula");

        }else{
            System.out.println("No es un digito, tampoco una letra");

        }
    }

}
