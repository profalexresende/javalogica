package com.alexdeus;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String opcao;
        System.out.println("ELOGIADOR!");
        System.out.println("Selecione a opção desejada:\nA-Elogio profissional\nB-Elogio físico\nC-Elogio pessoal");
        opcao = leitor.next().toUpperCase();
        switch(opcao) {
            case "A":
                System.out.println("Você é um profissional muito dedicado!");
                break;
            case "B":
                System.out.println("Você é uma pessoa muito forte!");
                break;
            case "C":
                System.out.println("Você é uma pessoa muito altruísta!");
                break;
            default:
                System.out.println("Opção inválida");
        }
        leitor.close();
    }
}

