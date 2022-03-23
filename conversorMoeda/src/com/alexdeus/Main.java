package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner leitor=new Scanner(System.in);
        float valorDoacao;
        float cotacao;
        float valorReais;
        System.out.println("Conversor Dólar x Real");
        System.out.println("Digite o valor da doação em dólares");
        valorDoacao=leitor.nextFloat();
        System.out.println("Digite a cotação do dólar");
        cotacao=leitor.nextFloat();
        valorReais=valorDoacao*cotacao;
        System.out.println("Valor da doação em R$" + valorReais);
        leitor.close();
    }
}
