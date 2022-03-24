package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade do eleitor");
        idade=leitor.nextInt();

        if(idade==16){
            System.out.println("Você não pode votar e nem embarcar!");
        }
        else if (idade<18){
            System.out.println("Voto facultativo, embarque permitido");
        }
        else{
            System.out.println("Voto obrigatório!");
        }
        leitor.close();
    }
}
