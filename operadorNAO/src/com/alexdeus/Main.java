package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String tipoUsuario;
        System.out.println("Por favor, digite seu tipo de usuário:");
        tipoUsuario = leitor.next();

        if (!tipoUsuario.equalsIgnoreCase("administrador")) {
            System.out.println("Atenção, usuário sem poderes administrativos");
        }
        leitor.close();
    }
}

