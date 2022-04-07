package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        String opcao;
        double celsius;
        do {
            System.out.println("Digite a temperatura em ºC");
            celsius = leitor.nextDouble();

            System.out.println("A temperatura em ºF é " + converterTemperatura(celsius) + "º");
            System.out.println("Deseja continuar o programa (S/N)?");
            opcao=leitor.next();
        }while(opcao.equalsIgnoreCase("s"));
    }

    public static double converterTemperatura(double c){
        return c*1.8+32;
    }
}
