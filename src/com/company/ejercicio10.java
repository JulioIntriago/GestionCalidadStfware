package com.company;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        //VARIABLES
        double kilometrosRecorridos;
        double precioGasolina;
        double dineroGasolina;
        double tiempo;
        double gasolina;
        double consumoA1;
        double consumoA2;
        double consumoB1;
        double consumoB2;
        double velocidad;
        double velocidadMetros;

        //INGRESO DATOS A TRAVES DE SCANNER
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el total de kilometros recorridos:");
        kilometrosRecorridos = scanner.nextDouble();
        System.out.println("Ingrese el precio de la gasolina por galón: ");
        precioGasolina = scanner.nextDouble();
        System.out.println("Ingrese el dinero de gasolina gastado en el viaje: ");
        dineroGasolina = scanner.nextDouble();
        System.out.println("Ingrese el tiempo tardado en horas y minutos:  ");
        tiempo=scanner.nextDouble();

        //Cantidad de gasolina que tenemos con lo que pagamos
        gasolina = dineroGasolina/precioGasolina;
        //Cantidad de gasolina gastada en las kilometros recorridas
        consumoB1=gasolina/kilometrosRecorridos;
        //Consumo del dinero por cada kilometro
        consumoB2=dineroGasolina/kilometrosRecorridos;
        // Se multiplica * 100 para saber el consumo en 100 kilometros
        consumoA1=consumoB1*30;
        consumoA2=consumoB2*1;

        velocidad=kilometrosRecorridos/tiempo;
        velocidadMetros=(velocidad*1000)/3600;

        //Imprimimos el resultado y lo que pide el usuario
        System.out.println("El consumo de gasolina en 30 kilometros es: "+String.format("%.2f", consumoA1)+" galon de gasolina y  "+String.format("%.2f", consumoA2)+"  dolares ");
        System.out.println("El consumo de gasolina en kilometros es: "+String.format("%.2f", consumoB1)+" galon de gasolina y  "+String.format("%.2f", consumoB2)+"  dolares ");
        System.out.println("La velocidad media en km/h es de: "+String.format("%.2f", velocidad)+" km/h y en m/s es de: "+String.format("%.2f", velocidadMetros)+" m/s");


    }

}
