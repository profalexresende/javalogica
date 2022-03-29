package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner leitor=new Scanner(System.in);
        int num;
        String extenso;
        System.out.println("Digite um número entre 1 e 10");
        num=leitor.nextInt();
        switch (num){
            case 1:
                extenso="Um";
                break;
            case 2:
                extenso="Dois";
                break;
            case 3:
                extenso="Três";
                break;
            case 4:
                extenso="Quatro";
                break;
            case 5:
                extenso="Cinco";
                break;
            case 6:
                extenso="Seis";
                break;
            case 7:
                extenso="Sete";
                break;
            case 8:
                extenso="Oito";
                break;
            case 9:
                extenso="Nove";
                break;
            case 10:
                extenso="Dez";
                break;
            default:
                extenso="Número inválido!";
        }
        System.out.println(extenso);
        leitor.close();
    }
}
