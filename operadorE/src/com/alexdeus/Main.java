package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String usuario, senha;
        System.out.println("SISTEMA DE LOGIN");
        System.out.println("Por favor, digite seu username:");
        usuario = leitor.next();
        System.out.println("Por favor, digite sua senha:");
        senha = leitor.next();
        if (usuario.equalsIgnoreCase("administrador") && senha.equalsIgnoreCase("123")){
            System.out.println("O usuário pode acessar o sistema!");
        }else {
            System.out.println("Usuário ou senha incorretos.");
        }
        leitor.close();
    }
}

