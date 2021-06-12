package com.company;


import java.util.Scanner;

public class ejercicio3 {
    /*
    La relación entre grados Celsius (C) y grados Fahrenheit (F) es la siguiente: F - 32 = 1,8 * C
    */
    double FahrenheitCelsius(double grado)
    {
        double gCelsius=(grado-32)/1.8;
        return gCelsius;
    }

    double CelsiusFahrenheit(double grado)
    {
        double gFahrenheit=(grado*1.8)+32;
        return gFahrenheit;
    }

    public static void main(String[] args)
    {
        char opcion;
        int medida;
        Scanner leer = new Scanner(System.in);
        System.out.println("OPCIONES");
        System.out.println("Digite el numero de la medida a convertir :");
        System.out.println("C.- CELSIUS");
        System.out.println("K.- FAHRENHEIT");
        System.out.println("Ingrese su opción:");
        opcion = (char) leer.nextInt();
        System.out.println("Ingrese número:");
        medida = leer.nextInt();
        ejercicio3 conversion = new ejercicio3();
        switch (opcion) {



            case 1:
                double resultado = conversion.convertirFahrenheitACelsius(medida);
                System.out.println(resultado);
                break;
            case 2:
                resultado = conversion.convertirFahrenheitACelsius(medida);
                resultado = conversion.convertirCelsiusAFahrenheit(resultado);
                System.out.println(resultado);
                break;
        }
        }
    public double convertirFahrenheitACelsius(double fahrenheit) {
        double celsius = 0;
        celsius = 5 * ((fahrenheit - 32) / 9);
        return celsius;
    }

    //    F = 32 + ( 9 * C / 5)
    public double convertirCelsiusAFahrenheit(double celsius) {
        double fahrenheit = 0;
        fahrenheit = 32 + ((9 * celsius) / 5);
        return fahrenheit;
    }
}
