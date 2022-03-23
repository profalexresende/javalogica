package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor=new Scanner(System.in);
        String nome;
        System.out.println("Por favor, digite seu nome:");
        nome=leitor.nextLine();
        System.out.println("O nome digitado foi " + nome);
        leitor.close();
    }
}