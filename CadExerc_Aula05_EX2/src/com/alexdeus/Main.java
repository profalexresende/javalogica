package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
	    double[][] matriz =new double[2][3];
        double somaPares=0;

        for(int linha=0;linha<2;linha++){
            for(int coluna=0;coluna<3;coluna++){
                System.out.println("Digite um número para a linha " + linha + " e coluna " + coluna);
                matriz[linha][coluna]=leitor.nextDouble();
                if (matriz[linha][coluna]%2==0) {
                    somaPares+=matriz[linha][coluna];
                }
            }
        }
        System.out.println("A soma dos números pares é " + somaPares);
    }
}
