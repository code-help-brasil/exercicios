/*Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O 
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a tabela a seguir:
- Carros populares (aluguel de R$90 por dia)
- Até 100Km percorridos: R$0,20 por Km
- Acima de 100Km percorridos: R$0,10 por Km
- Carros de luxo (aluguel de R$150 por dia)
- Até 200Km percorridos: R$0,30 por Km
- Acima de 200Km percorridos: R$0,25 por Km */
//%s %f %d 
package org.example;

import java.util.Scanner;

public class Ex035 {
    
    public static void main(String[] args) {
        Ex035.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo de carro (popular ou luxo): ");
        String tipo = sc.nextLine();

        System.out.print("Digite a quantidade de dias de aluguel: ");
        int dias = sc.nextInt();

        System.out.print("Digite a quantidade de Km percorridos: ");
        int km = sc.nextInt();

        double valorAluguel = 0;
        double valorKm = 0;

        if (tipo.equalsIgnoreCase("popular")) {
            valorAluguel = dias * 90;
            if (km <= 100) {
                valorKm = km * 0.2;
            } else {
                valorKm = km * 0.1;
            }
        } else if (tipo.equalsIgnoreCase("luxo")) {
            valorAluguel = dias * 150;
            if (km <= 200) {
                valorKm = km * 0.3;
            } else {
                valorKm = km * 0.25;
            }
        }
        double valorTotal = valorAluguel + valorKm;
        System.out.printf("Valor total a pagar: R$%.2f", valorTotal);

        sc.close();
    }

}
