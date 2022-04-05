package com.alexdeus;

import java.util.Scanner;

public class Main {
    public static Scanner leitor=new Scanner(System.in);

    public static void main(String[] args) {

        calcularSalario();

        /*
        double salario,indice;
        System.out.println("Digite seu salário atual:");
        salario=leitor.nextDouble();
        System.out.println("Digite o índice de aumento:");
        indice=leitor.nextDouble();
	    calcularSalario(salario,indice);

         */
    }

    public static void calcularSalario(){
        double salario,indice;
        double novoSalario;
        System.out.println("Digite seu salário atual:");
        salario=leitor.nextDouble();
        System.out.println("Digite o índice de aumento:");
        indice=leitor.nextDouble();
        novoSalario=salario+(salario*(indice/100));
        System.out.println("Seu novo salario é de R$" + novoSalario);
    }



    /*
    public static void calcularSalario(double salario,double indice){
        double novoSalario;
        novoSalario=salario+(salario*(indice/100));
        System.out.println("Seu novo salario é de R$" + novoSalario);
    }

     */


}
