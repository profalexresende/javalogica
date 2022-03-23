package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int valor1;
        int valor2;
        int res;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Este programa irá exibir a soma de dois números");
        System.out.println("Digite o primeiro número");
        valor1=leitor.nextInt();
        System.out.println("Digite o segundo número");
        valor2=leitor.nextInt();
        res=valor1+valor2;
        System.out.println("A soma dos dois números digitados é: " + res);
        leitor.close();
    }
}
