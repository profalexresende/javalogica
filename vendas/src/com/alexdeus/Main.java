package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
        final float pix= (float) 0.05;
        final float credito=(float) 1.1;

        float valorVenda,valorFinal=0;
        String fPgto;

        System.out.println("Digite o valor da venda:");
        valorVenda=leitor.nextFloat();
        System.out.println("Digite a forma de Pagamento:\nPix\nDébito\nCrédito");
        fPgto=leitor.next();
        if(fPgto.equalsIgnoreCase("Pix")){
            valorFinal= (float) (valorVenda-(valorVenda*pix));
        }
        else if(fPgto.equalsIgnoreCase("débito")||fPgto.equalsIgnoreCase("debito")){
            valorFinal=valorVenda;
        }
        else if(fPgto.equalsIgnoreCase("Crédito")||fPgto.equalsIgnoreCase("credito")){
            valorFinal= (float) (valorVenda*credito);
        }
        else{
            System.out.println("Forma de pagamento inválida!");
        }
        System.out.println("O valor final de sua compra é: R$" + valorFinal);
        leitor.close();
    }
}
