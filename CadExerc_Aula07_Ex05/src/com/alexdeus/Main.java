package com.alexdeus;

import java.util.Scanner;

public class Main {
    public static Scanner leitor=new Scanner(System.in);

    public static void main(String[] args) {

        String opcao ;
/*
        do {
            verificarIndice();
            System.out.println("Deseja encerrar a aplicação (S/N)?");
            opcao = leitor.next();
        } while (opcao.equalsIgnoreCase("n"));



 */

        do{
            double indice;
            System.out.println("Digite o índice de poluição:");
            indice=leitor.nextDouble();
            verificarIndice(indice);
            System.out.println("Deseja encerrar a aplicação (S/N)?");
            opcao=leitor.next();
        }while (opcao.equalsIgnoreCase("n"));
    }

/*
    public static void verificarIndice(){
        double indice;
        System.out.println("Digite o índice de poluição:");
        indice=leitor.nextDouble();
        if (indice>=0.3 && indice<0.4){
            System.out.println("Empresas do GRUPO 1 devem suspender suas atividades");
        }
        else if(indice>=0.4 && indice<0.5){
            System.out.println("Empresas do GRUPO 1 e 2 devem suspender suas atividades");
        }
        else if (indice>0.5){
            System.out.println("Empresas do GRUPO 1, 2 e 3 devem suspender suas atividades");
        }
        else{
            System.out.println("Níveis de poluição aceitáveis!");
        }

    }


 */

    public static void verificarIndice(double indice){

        if (indice>=0.3 && indice<0.4){
            System.out.println("Empresas do GRUPO 1 devem suspender suas atividades");
        }
        else if(indice>=0.4 && indice<0.5){
            System.out.println("Empresas do GRUPO 1 e 2 devem suspender suas atividades");
        }
        else if (indice>0.5){
            System.out.println("Empresas do GRUPO 1, 2 e 3 devem suspender suas atividades");
        }
        else{
            System.out.println("Níveis de poluição aceitáveis!");
        }

    }
}
