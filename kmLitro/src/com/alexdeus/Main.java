package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner leitor=new Scanner(System.in);
        float kmIni,kmFim,litros,media;
        System.out.println("Encontre a autonomia médio do seu veículo");
        System.out.println("Digite a KM indicada no painel do veículo - início da viagem");
        kmIni=leitor.nextFloat();
        System.out.println("Digite a KM indicada no painel do veículo - fim da viagem");
        kmFim=leitor.nextFloat();
        System.out.println("Digite a qtde de litros de combustível");
        litros=leitor.nextFloat();
        media=(kmFim-kmIni)/litros;
        System.out.println("Este veículo faz em média " + media + "km/l");
    }
}
