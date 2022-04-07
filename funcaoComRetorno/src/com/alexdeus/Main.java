package com.alexdeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        int qtdeProdutos;
        System.out.println("Entre com a quantidade de produtos no carrinho:");
        qtdeProdutos=leitor.nextInt();
        double[] produtos=new double[qtdeProdutos];

        for(int i=0;i< produtos.length;i++){
            System.out.println("Digite o valor do produto");
            produtos[i]=leitor.nextDouble();
        }
        System.out.println("Valor final da venda: R$" + somarCarrinho(produtos));
    }

    public static double somarCarrinho(double[] produtos) {
        double soma = 0;
        double totalComDesconto;
        for(int i=0; i<produtos.length;i++) {
            soma = soma + produtos[i];
        }
        //Conceder 10% de desconto quando o valor total do carrinho for maior que R$500,00

        if(soma>500){
            totalComDesconto=soma-(soma*0.1);
            return totalComDesconto;
        }
        else{
            return soma;
        }

    }

}
