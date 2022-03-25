package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite um valor para A");
        a = leitor.nextInt();
        System.out.println("Digite um valor para B");
        b = leitor.nextInt();
        System.out.println("Digite um valor para C");
        c = leitor.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("Todos os números devem ser diferentes");
        } else {
            if (a < b && a < c && b < c) {
                System.out.println(a + ", " + b + " e " + c);
            } else if (a < b && a < c && c < b) {
                System.out.println(a + ", " + c + " e " + b);
            } else if (b < a && b < c && a < c) {
                System.out.println(b + ", " + a + " e " + c);
            } else if (b < a && b < c && c < a) {
                System.out.println(b + ", " + c + " e " + a);
            } else if (c < a && c < b && a < b) {
                System.out.println(c + ", " + a + " e " + b);
            } else {
                System.out.println(c + ", " + b + " e " + a);
            }
        }
    }
}
