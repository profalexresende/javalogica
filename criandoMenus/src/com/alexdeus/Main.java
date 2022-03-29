package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1 = 0, n2 = 0, res;
        int opcao = 1;
        while (opcao != 0) {
            System.out.println("CALCULADORA EM JAVA\n");
            System.out.println("Digite a opção desejada:\n1 - Somar\n2 - Subtrair\n" +
                    "3 - Multiplicar\n4 - Dividir\n0 - Sair");
            opcao = leitor.nextInt();
            if (!(opcao <= 0 || opcao > 4)) {
                System.out.println("Digite o primeiro número");
                n1 = leitor.nextDouble();
                System.out.println("Digite o segundo número");
                n2 = leitor.nextDouble();
            }
            switch (opcao) {
                case 1:
                    res = n1 + n2;
                    System.out.println("A soma dos números digitados é: " + res);
                    break;
                case 2:
                    res = n1 - n2;
                    System.out.println("A subtração dos números digitados é: " + res);
                    break;
                case 3:
                    res = n1 * n2;
                    System.out.println("A multiplicação dos números digitados é: " + res);
                    break;
                case 4:
                    res = n1 / n2;
                    System.out.println("A divisão dos números digitados é: " + res);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}

