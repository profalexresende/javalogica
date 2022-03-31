package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, maior = -9999, menor = 9999, i = 1;
        float media, somat = 0;
        String opcao;
        /*
        while (opcao.equalsIgnoreCase("s")) {
            menor=9999;
            maior=-9999;
            somat=0;
            i=1;
            while (i <= 4) {
                System.out.println("Digite o " + i + " º número:");
                numero = leitor.nextInt();
                if (numero < menor) {
                    menor = numero;
                }

                if (numero > maior) {
                    maior = numero;
                }
                somat += numero;
                i++;
            }
            media = (float) (somat / 4);
            System.out.println("O maior número é: " + maior +
                    "\nO menor número é: " + menor +
                    "\nA média dos valores digitados é: " + media);
            System.out.println("\nDeseja continuar (S/N)?");
            opcao=leitor.next();
        }

 */

        do {
            menor=9999;
            maior=-9999;
            somat=0;
            i=1;
            while (i <= 4) {
                System.out.println("Digite o " + i + " º número:");
                numero = leitor.nextInt();
                if (numero < menor) {
                    menor = numero;
                }

                if (numero > maior) {
                    maior = numero;
                }
                somat += numero;
                i++;
            }
            media = (float) (somat / 4);
            System.out.println("O maior número é: " + maior +
                    "\nO menor número é: " + menor +
                    "\nA média dos valores digitados é: " + media);
            System.out.println("\nDeseja continuar (S/N)?");
            opcao=leitor.next();
        }while (opcao.equalsIgnoreCase("s"));
    }
}
