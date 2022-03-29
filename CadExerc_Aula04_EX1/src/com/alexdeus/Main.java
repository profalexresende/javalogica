package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner leitor=new Scanner(System.in);
        int somaPositivo=0,qtdeNegativo=0;
        int i=1;
        int numero;
        String opcao="S";
        while (opcao.equalsIgnoreCase("s")) {
            i=1;
            somaPositivo=0;
            qtdeNegativo=0;
            while (i <= 10) {
                System.out.println("Digite o " + i + "º número");
                numero = leitor.nextInt();
                if (numero >= 0) {
                    somaPositivo += numero; //somaPositivo=somaPositivo+numero;
                } else {
                    qtdeNegativo++;//qtdeNegativo=qtdeNegativo+1;
                }
                i++;
            }
            System.out.println("A soma dos positivos é: " + somaPositivo);
            System.out.println("A qtde de negativos é: " + qtdeNegativo);
            System.out.println("Deseja continuar(S/N)?");
            opcao=leitor.next();
        }
    }
}
