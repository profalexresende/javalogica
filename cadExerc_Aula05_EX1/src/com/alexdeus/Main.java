package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner leitor=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        int[] c=new int[6];

        for (int i=0;i<a.length;i++){
            System.out.println("Digite o " + (i+1) + "º elemento do vetor A");
            a[i]=leitor.nextInt();
            c[i]=a[i];
        }

        for (int i=0;i<b.length;i++){
            System.out.println("Digite o " + (i+1) + "º elemento do vetor B");
            b[i]=leitor.nextInt();
            c[i+3]=b[i];
        }

        for (int i=0;i<c.length;i++){
            System.out.println("O " + (i+1) + "º elemento do vetor C é " + c[i]);
        }

    }
}
