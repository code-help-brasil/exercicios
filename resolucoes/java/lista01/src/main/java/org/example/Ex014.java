/*A locadora de carros precisa da sua ajuda para cobrar seus serviços.
 Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e
 a quantidade de dias pelos quais ele foi alugado.
Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 */

package org.example;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Ex014.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos Km foram percorridos?: ");
        Float km = sc.nextFloat();
        System.out.print("Quantos dias o carro ficou alugado?: ");
        Integer dias = sc.nextInt();
        Double preco_final = (dias * 90) + (km * 0.2);
        System.out.printf("O preço para pagar pelo aluguel do carro é R$%.2f", preco_final);
        sc.close();

    }

}