package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner leitor=new Scanner (System.in);
        int qtdeSalarios,i=1;
        float salario,maiorSal=0,menorSalario=9999999;
        float mediaSalarial,somaSalarios=0;

        System.out.println("Digite a quantidade de funcionáros na empresa:");
        qtdeSalarios=leitor.nextInt();

        while(i<=qtdeSalarios){
            System.out.println("Digite o salário do " + i + "º funcionário");
            salario=leitor.nextFloat();

            if(salario<menorSalario){
                menorSalario=salario;
            }

            if(salario>maiorSal){
                maiorSal=salario;
            }

            somaSalarios+=salario;
            i++;
        }
        leitor.close();
        mediaSalarial=somaSalarios/qtdeSalarios;
        System.out.println("Maior salário: R$" + maiorSal +
                "\nMenor Salário: R$" + menorSalario +
                "\nMédia Salarial: R$" + mediaSalarial) ;
    }
}
