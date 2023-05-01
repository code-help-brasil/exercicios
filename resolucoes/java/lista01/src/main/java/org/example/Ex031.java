/*Crie um jogo de JoKenPo (Pedra-Papel-Tesoura) */

package org.example;

import java.util.Scanner;
import java.util.Random;

public class Ex031 {
    public static void main(String[] args) {
        Ex031.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        String[] opcoes = { "pedra", "papel", "tesoura" };
        System.out.print("Escolha pedra,papel ou tesoura: ");
        String resposta = sc.nextLine();
        Random rand = new Random();
        String escolha_computador = opcoes[rand.nextInt(opcoes.length)];
        if (resposta == escolha_computador) {
            System.out.printf("Empate voce escolheu %s e o computaodor escolheu %s ", resposta, escolha_computador);
        } else if (escolha_computador == "tesoura" && resposta == "papel") {
            System.out.printf("Derrota voce escolheu %s e o computaodor escolheu %s ", resposta, escolha_computador);
        } else if (escolha_computador == "pedra" && resposta == "tesoura") {
            System.out.printf("Derrota voce escolheu %s e o computaodor escolheu %s ", resposta, escolha_computador);
        } else if (escolha_computador == "papel" && resposta == "pedra") {
            System.out.printf("Derrota voce escolheu %s e o computaodor escolheu %s ", resposta, escolha_computador);
        } else {
            System.out.printf("Vítoria voce escolheu %s e o computaodor escolheu %s ", resposta, escolha_computador);
        }
        sc.close();

    }

}
