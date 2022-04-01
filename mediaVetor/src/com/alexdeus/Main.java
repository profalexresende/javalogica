package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double media,somat=0;
        int qtdeAlunos=0;

        System.out.println( "Digite a qtde de alunos na turma:");
        qtdeAlunos=leitor.nextInt();

        double alunos[]=new double[qtdeAlunos];

        for(int i=0;i<=alunos.length-1;i++) {
            System.out.println("Por favor, digite a nota do " + (i+1) + "º aluno");
            alunos[i] = leitor.nextDouble();
            somat+=alunos[i];
        }

       for(int i=0;i<alunos.length;i++) {
           System.out.println("O aluno " + (i+1) + " tem nota " + alunos[i]);
       }

        media = somat/qtdeAlunos ; //media=alunos.length;
        System.out.println("A média da turma é " + String.format("%.1f", media));

        leitor.close();
    }
}
