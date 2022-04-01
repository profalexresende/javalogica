package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        double[][] matriz =new double[3][2];
        double somaLinha=0,somaColuna=0;

        for(int linha=0;linha<3;linha++){
            for(int coluna=0;coluna<2;coluna++){
                System.out.println("Digite um número para a linha " + linha + " e coluna " + coluna);
                matriz[linha][coluna]=leitor.nextDouble();
                if (linha==0) {
                    somaLinha+=matriz[linha][coluna];
                }

                if (coluna==0){
                    somaColuna+=matriz[linha][coluna];
                }
            }
        }
        System.out.println("A soma dos elementos da primeira linha é: " + somaLinha +
                "\nA soma dos elementos da primeira coluna é: " + somaColuna);
    }
}
