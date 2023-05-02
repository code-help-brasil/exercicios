/*Um programa de vida saudável quer dar pontos atividades físicas que podem 
ser trocados por dinheiro. O sistema funciona assim:
 - Cada hora de atividade física no mês vale pontos
 - até 10h de atividade no mês: ganha 2 pontos por hora
 - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
 - acima de 20h de atividade no mês: ganha 10 pontos por hora
 - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos) 
Faça um programa que leia quantas horas de atividade uma pessoa teve por mês, 
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
 */

package org.example;

import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args) {
        Ex036.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas horas por dia voce faz atividade física ?: ");
        Integer horas_dia = sc.nextInt() * 30;
        if (horas_dia <= 10) {
            System.out.printf("Voce ganhou %d pontos em reais são %d", horas_dia * 2, horas_dia * 2 / 0.05);
        } else if (horas_dia > 10 && horas_dia <= 20) {
            System.out.printf("Voce ganhou %d pontos em reais são %d", horas_dia * 5, horas_dia * 5 / 0.05);
        } else {
            System.out.printf("Voce ganhou %d pontos em reais são %d", horas_dia * 10, horas_dia * 10 / 0.05);
        }
        sc.close();
    }
}
