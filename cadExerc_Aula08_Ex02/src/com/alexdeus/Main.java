package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        String opcao;
        int base,expoente;
        do {
            System.out.println("Digite a base:");
            base = leitor.nextInt();
            System.out.println("Digite expoente:");
            expoente = leitor.nextInt();

            System.out.println("Resultado: " + potencia(base,expoente));
            System.out.println("Deseja continuar (S/N)?");
            opcao=leitor.next();
        }while(opcao.equalsIgnoreCase("s"));
    }

    public static int potencia(int base,int expoente){
        int resultado=1;
        for (int i=1;i<=expoente;i++) {
            resultado*=base;
        }
        return resultado;
    }
}
