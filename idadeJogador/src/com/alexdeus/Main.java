package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner leitor=new Scanner(System.in);
        int idade;
        System.out.println("Digite a sua idade");
        idade=leitor.nextInt();
        if(idade>=12){
            System.out.println("Você pode jogar!");
        }
        leitor.close();
    }
}
