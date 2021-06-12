package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio20 {


    public static void main(String[] args) {

        int num_1, num_2, num_3, num_4, num_5, num_6, num_7, num_8, num_9;
        int digito_autoverificador = 0;

        List<Integer> arreglo_pares = new ArrayList<Integer>();
        List<Integer> arreglo_impares = new ArrayList<Integer>();
        List<Integer> arreglo_impares_2 = new ArrayList<Integer>();

        try {
            //Digito 1
            Scanner n1 = new Scanner(System.in);

            System.out.println("Ingrese el primer digito: ");
            num_1 = n1.nextInt();
            arreglo_impares.add(num_1);

            //Digito 2
            Scanner n2 = new Scanner(System.in);

            System.out.println("Ingrese el segundo digito: ");
            num_2 = n2.nextInt();
            arreglo_pares.add(num_2);

            //Digito 3
            Scanner n3 = new Scanner(System.in);

            System.out.println("Ingrese el tercer digito: ");
            num_3 = n3.nextInt();
            arreglo_impares.add(num_3);

            //Digito 4
            Scanner n4 = new Scanner(System.in);

            System.out.println("Ingrese el cuarto digito: ");
            num_4 = n4.nextInt();
            arreglo_pares.add(num_4);

            //Digito 5
            Scanner n5 = new Scanner(System.in);

            System.out.println("Ingrese el quinto digito: ");
            num_5 = n5.nextInt();
            arreglo_impares.add(num_5);

            //Digito 6
            Scanner n6 = new Scanner(System.in);

            System.out.println("Ingrese el sexto digito: ");
            num_6 = n6.nextInt();
            arreglo_pares.add(num_6);

            //Digito 7
            Scanner n7 = new Scanner(System.in);

            System.out.println("Ingrese el septimo digito: ");
            num_7 = n7.nextInt();
            arreglo_impares.add(num_7);

            //Digito 8
            Scanner n8 = new Scanner(System.in);

            System.out.println("Ingrese el octavo digito: ");
            num_8 = n8.nextInt();
            arreglo_pares.add(num_8);

            //Digito 9
            Scanner n9 = new Scanner(System.in);

            System.out.println("Ingrese el noveno digito: ");
            num_9 = n9.nextInt();
            arreglo_impares.add(num_9);

            //System.out.println(arreglo_impares);
            //System.out.println(arreglo_pares);
            //Recorrer el arreglo impar y multiplicar x 2
            for (int i = 0; i < arreglo_impares.size(); i++) {
                int nuevo_valor = arreglo_impares.get(i) * 2;
                //validamos que la multiplicacion nos de un valor menor que 10
                if (nuevo_valor >= 10) {
                    int nuevo_valor_reducido = nuevo_valor - 9;
                    arreglo_impares_2.add(nuevo_valor_reducido);
                } else {
                    arreglo_impares_2.add(nuevo_valor);
                }

            }
            //System.out.println(arreglo_impares_2);
            //recorremos cada arreglo para sacar la suma
            int sum_arregloPar = 0;
            for (int j = 0; j < arreglo_pares.size(); j++) {
                sum_arregloPar += arreglo_pares.get(j);
            }
            //System.out.println("La suma es:"+sum_arregloPar);

            int sum_arregloImpares = 0;
            for (int p = 0; p < arreglo_impares_2.size(); p++) {
                sum_arregloImpares += arreglo_impares_2.get(p);
            }
            //System.out.println("La suma es:"+sum_arregloImpares);

            int suma_total_digitos = sum_arregloPar + sum_arregloImpares;

            //validar si es modulo de 10 para determinar si el digito es 0
            if (suma_total_digitos % 10 == 0) {
                System.out.println("El Dígito Autoverificador es: 0");
            } else {
                int contador_modulo = suma_total_digitos;

                //for para encontrar el multiplo proximo de 10
                for (int n = 1; n <= 10; n++) {

                    if (contador_modulo % 10 == 0) {
                        digito_autoverificador = contador_modulo - suma_total_digitos;

                    } else {

                        contador_modulo += 1;

                    }
                }
                System.out.println("El Dígito Autoverificador es:" + digito_autoverificador);
            }
        } catch (Exception error) {
            System.out.println("Solo numeros del 0 al 9, intentelo de muevo.");
        }

    }
}