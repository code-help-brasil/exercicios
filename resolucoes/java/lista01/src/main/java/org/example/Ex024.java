/*Faça um algoritmo que pergunte a distância que um passageiro deseja 
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para 
viagens até 200Km e R$0.45 para viagens mais longas. */

package org.example;

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Ex024.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a distância que deseja percorrer: ");
        Float distancia = sc.nextFloat();
        if (distancia <= 200) {
            System.out.printf("O valor da viagem será %s", distancia * 0.50);

        } else {
            System.out.printf("O valor da viagem será %s", distancia * 0.45);
        }
        sc.close();
    }

}
