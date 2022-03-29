package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a,b,c;
        String mensagem;
        System.out.println("Digite o primeiro número:");
        a=leitor.nextInt();
        System.out.println("Digite o segundo número:");
        b=leitor.nextInt();
        System.out.println("Digite o terceiro número:");
        c=leitor.nextInt();
        if(!(a==b || a==c || b==c)){
            if(a<b && a<c){
                mensagem="O menor número é o " + a;
            }
            else if(b<a && b<c){
                mensagem="O menor número é o " + b;
            }
            else {
                mensagem="O menor número é o " + c;
            }
        }else{
            mensagem="Por favor, digite 3 números diferentes";
        }
        System.out.println(mensagem);
        leitor.close();
    }
}
