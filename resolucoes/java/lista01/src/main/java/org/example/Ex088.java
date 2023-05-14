/*
 Crie um programa que melhore o procedimento Gerador() da questão anterior 
para que mostre uma mensagem vário
ex:
Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
 */

package org.example;

import java.util.Scanner;

public class Ex088 {
    public static void gerador(String mensagem, int x) {
        System.out.println("+-------=======------+");

        for (int i = 0; i < x; i++) {
            System.out.println(" " + mensagem + " ");
        }

        System.out.println("+-------=======------+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma mensagem: ");
        String msg = sc.nextLine();
        System.out.print("Digite quantas vezes você deseja que a mensagem apareça: ");
        int vezes = sc.nextInt();
        gerador(msg, vezes);
        sc.close();
    }
}
