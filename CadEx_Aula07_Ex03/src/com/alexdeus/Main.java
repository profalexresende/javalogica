package com.alexdeus;

import java.util.Scanner;

public class Main {
    public static Scanner leitor=new Scanner(System.in);

    public static void main(String[] args) {

        classificaNadador();

        /*
        int idade;
        System.out.println("Digite a idade do atleta:");
        idade = leitor.nextInt();
        classificaNadador(idade);

         */
    }

    public static void classificaNadador() {
        int idade;
        System.out.println("Digite a idade do atleta:");
        idade = leitor.nextInt();
        if (idade >= 5) {
            if (idade <= 7) {
                System.out.println("Categoria Infantil A");
            } else if (idade <= 11) {
                System.out.println("Categoria Infantil B");
            } else if (idade <= 13) {
                System.out.println("Categoria Juvenil A");
            } else if (idade <= 17) {
                System.out.println("Categoria Juvenil B");
            } else {
                System.out.println("Categoria Adulto");
            }
        }else{
            System.out.println("Atleta não atingiu idade mínima!");
        }
    }

    /*
    public static void classificaNadador(int idade) {
        if (idade >= 5) {
            if (idade <= 7) {
                System.out.println("Categoria Infantil A");
            } else if (idade <= 11) {
                System.out.println("Categoria Infantil B");
            } else if (idade <= 13) {
                System.out.println("Categoria Juvenil A");
            } else if (idade <= 17) {
                System.out.println("Categoria Juvenil B");
            } else {
                System.out.println("Categoria Adulto");
            }
        }else{
            System.out.println("Atleta não atingiu idade mínima!");
        }
    }

     */
}
