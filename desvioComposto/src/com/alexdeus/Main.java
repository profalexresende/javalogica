package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        float doacao,investimento;

        System.out.println("Digite o valor da doação:");
        doacao=leitor.nextFloat();

        if(doacao<=1000){
            investimento= (float) (doacao*0.05);
        }
        else {
            investimento= (float) (doacao*0.15);
        }
        System.out.println("O investimento será de R$" + investimento);
        leitor.close();
    }
}
