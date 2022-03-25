package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double totalCompra, valorFinal=0.0;
        String cupom;
        System.out.println("SISTEMA DE DESCONTOS");
        System.out.println("Por favor, digite o valor total da compra");
        totalCompra = leitor.nextDouble();
        System.out.println("Por favor, digite o seu cupom");
        cupom = leitor.next();
        if(totalCompra > 1000.00 || cupom.equalsIgnoreCase("DESCONTO20")) {
            valorFinal = totalCompra * 0.8;
        }else {
            valorFinal = totalCompra;
        }
        System.out.println("O valor final é de R$" + valorFinal);
        leitor.close();

    }
}
