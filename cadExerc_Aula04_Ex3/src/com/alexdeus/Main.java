package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
        int num1,num2,resp=0;
        int i=1;

        System.out.println("Digite o primeiro número:");
        num1=leitor.nextInt();

        System.out.println("Digite o segundo número:");
        num2=leitor.nextInt();
        /*
        while(i<=num1){
            resp+=num2;
            i++;
        }

 */
        /*
        do{
            resp+=num2;
            i++;
        }while(i<=num1);
        */

        for(int contador=1;contador<=num2;contador++){
            resp+=num2;
        }
        System.out.println("Multiplicação: " + resp);
    }
}
