package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner leitor=new Scanner(System.in);
        final int qtdeLinhas=4;
        final int qtdeColunas=3;

        double[][] matriz=new double[qtdeLinhas][qtdeColunas];

        //ENTRADA DE DADOS
        for(int linha=0;linha<qtdeLinhas;linha++){
            for(int coluna=0;coluna<qtdeColunas;coluna++){
                System.out.println("Digite o elemento da linha " + linha + " e coluna " + coluna);
                matriz[linha][coluna]=leitor.nextDouble();
            }
        }

        //SAÍDA DE DADOS
        for(int linha=0;linha<qtdeLinhas;linha++){
            for(int coluna=0;coluna<qtdeColunas;coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
