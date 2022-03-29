package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double altura=0, media,somaAlturas=0;
        Scanner leitor = new Scanner(System.in);
        int qtdeAlunos=0;

        while(altura!=-1){
            System.out.println("Digite a altura do aluno ou -1 para encerrar");
            altura = leitor.nextDouble();
            if(altura!=-1) {
                somaAlturas += altura;
                qtdeAlunos++;
            }
        }
        if (qtdeAlunos!=0) {
            media = somaAlturas / qtdeAlunos;
        }
        else{
            media=0;
        }
       System.out.println("A altura média dos alunos é: " + media);
       leitor.close();
    }
}
