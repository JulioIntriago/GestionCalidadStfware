package com.company;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {

        while (true) {
            try
            {
                Scanner input=new Scanner(System.in);
                int num;
                int mes;
                System.out.println("ingrese un numero del 1 al 365");
                num=input.nextInt();

                if(num<1||num>365){
                    System.out.println("numero fuera de rango ");
                }else{

                    if(num>=1&&num<=31){
                        System.out.println("Corresponde a Enero:" +num);


                    }else if(num<=59){
                        System.out.println("corresponde a febrero:" +(num-31));
                    }else if(num<=90){
                        System.out.println("corresponde a Marzo:" +(num-59));
                    }else if(num<=120){
                        System.out.println("corresponde a Abril:" +(num-90));
                    }else if(num<=151){
                        System.out.println("Corresponde a Mayo :" +(num-120));
                    }else if(num<=181){
                        System.out.println("Corresponde a Junio: "+(num-151) );
                    } else if(num<=212){
                        System.out.println("Corresponde a Julio: " +(num-181));
                    }else if(num<=243){
                        System.out.println("Corresponde a Agosto: "+(num-212));
                    }else if(num<=273){
                        System.out.println("Corresponde a Septiembre: " +(num-243));
                    }else if(num<=304){
                        System.out.println("Corresponde a Octubre: " +(num-273));
                    }else if(num<=334){
                        System.out.println("corresponde Noviembre: "+(num-304));
                    }else if(num<=365){
                        System.out.println("Corresponde a Diciembre: "+(num-334));
                    }
                    break;
                }

            }
            catch(Exception excepcionE)
            {
                System.out.println("Error no es un numero");

            }
        }

    }
}