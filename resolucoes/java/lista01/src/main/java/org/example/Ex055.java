/*
 [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de 
agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4 
tentativas para tentar acertar.
 */

package org.example;

import java.util.Random;
import java.util.Scanner;

public class Ex055 {
    public static void main(String[] args) {
        Ex055.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int i = 4;
        int numeroAleatorio = rand.nextInt(10) + 1;

        while (i >= 0) {
            System.out.print("Digite um número: ");
            Integer escolha = sc.nextInt();
            i--;
            if (numeroAleatorio == escolha) {
                System.out.printf("Voce acertou!");
                break;
            } else {
                System.out.printf("Ops! você errou,ainda há %d tentativas.\n", i);
            }
        }
        sc.close();
    }

}
