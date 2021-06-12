package com.company;

public class ejercicio13 {


    static boolean validar (int n )

    {
        int sumatoria=0;
        for (int i=1; i < n; i++){
            if(n%i==0)
                sumatoria= sumatoria+i;
        }
        if(sumatoria == n)
            return true;
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite numero");
        int numero = new java.util.Scanner(System.in).nextInt();
        if(validar(numero)==true)
            System.out.println("El numero es perfecto");
        else
            System.out.println("El numero es primo");
    }

}

