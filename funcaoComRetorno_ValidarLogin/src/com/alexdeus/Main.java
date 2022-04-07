package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        String usuario,senha;
        System.out.println("Digite seu nome de usuário:");
        usuario= leitor.next();
        System.out.println("Digite sua senha");
        senha=leitor.next();

        if (validarLogin(usuario,senha)){
            //Execução das instruções para usuário validado
            System.out.println("Bem vindo Administrador");
        }
        else{
            //Execução das instruções para usuário não validado;
            System.out.println("Usuário e/ou senha inválidos!");
        }
    }

    public static boolean validarLogin(String username, String senha){
        if (username.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("123")){
            return true;
        }
        else {
            return false;
        }
    }
}
