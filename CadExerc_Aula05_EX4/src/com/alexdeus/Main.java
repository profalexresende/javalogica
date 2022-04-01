package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        int tamanhoVetor;

        System.out.println("Digite o tamanho dos vetores");
        tamanhoVetor=leitor.nextInt();
        double[] a =new double[tamanhoVetor];
        double[] b =new double[tamanhoVetor];
        double[] c =new double[tamanhoVetor];

        for(int i=0;i<a.length;i++){
            System.out.println("Digite o elemento " + (i+1) + "º do vetor A");
            a[i]=leitor.nextDouble();
        }
        for(int i=0;i<b.length;i++){
            System.out.println("Digite o elemento " + (i+1) + "º do vetor B");
            b[i]=leitor.nextDouble();
        }

        for(int i=0;i<c.length;i++){
            c[i]=a[i]+b[i];
            System.out.println("A soma da " + (i+1) + "ª linha de A com a + " + (i+1) +
        "ª linha de B é " + c[i]);
        }
    }
}
