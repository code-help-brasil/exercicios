/*
Faça um programa que tenha um procedimento chamado Contador() que recebe 
três valores como parâmetro: o início, o fim e o incremento de uma contagem. O
programa principal deve solicitar a digitação desses valores e passá-los ao 
procedimento, que vai mostrar a contagem na tela.
Ex: Para os valores de início (4), fim (20) e incremento(3) teremos
Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM
 */

package org.example;

import java.util.Scanner;

public class Ex093 {
    public static void Contador(int inicio, int fim, int incremento) {
        for (int i = inicio; i <= fim; i += incremento) {
            System.out.print(i + " >> ");
        }
        System.out.println("FIM");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o início: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o fim: ");
        int fim = sc.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = sc.nextInt();

        Contador(inicio, fim, incremento);
        sc.close();
    }
}
