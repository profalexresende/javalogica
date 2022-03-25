package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner leitor=new Scanner(System.in);
        float salario,novoSalario;
        String categoria;
        System.out.println("Digite seu selário:");
        salario = leitor.nextFloat();
        System.out.println("Digite sua categoria");
        categoria=leitor.next();

        if (categoria.equalsIgnoreCase("A") || categoria.equalsIgnoreCase("C") ||
        categoria.equalsIgnoreCase("F")||categoria.equalsIgnoreCase("H")){
            novoSalario= (float) (salario*1.1);
        }
        else if (categoria.equalsIgnoreCase("B") || categoria.equalsIgnoreCase("D") ||
                categoria.equalsIgnoreCase("T")) {
            novoSalario = (float) (salario * 1.15);
        }
        else if (categoria.equalsIgnoreCase("K") || categoria.equalsIgnoreCase("R")) {
            novoSalario = (float) (salario * 1.25);
        }
        else{
            System.out.println("Categoria inválida");
            novoSalario=0;
        }
        System.out.println("Seu novo salário: R$" + novoSalario);
        leitor.close();

    }
}
