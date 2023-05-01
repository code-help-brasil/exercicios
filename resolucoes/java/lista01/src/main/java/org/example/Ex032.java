/*[DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o jogador 
vai tentar descobrir qual foi o valor sorteado.
 */

package org.example;

import java.util.Scanner;

public class Ex032 {
    public static void main(String[] args) {
        Ex032.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        double valorCasa = sc.nextDouble();

        System.out.print("Salário do comprador: ");
        double salario = sc.nextDouble();

        System.out.print("Quantos anos vai pagar: ");
        int anos = sc.nextInt();

        int meses = anos * 12;
        double prestacao = valorCasa / meses;

        if (prestacao <= salario * 0.3) {
            System.out.printf("Empréstimo aprovado. Valor da prestação: R$ %.2f%n", prestacao);
        } else {
            System.out.println("Empréstimo negado. Valor da prestação excede 30% do salário.");
        }

        sc.close();
    }

}
/*
 * byte 1 byte Armazena números inteiros de -128 a 127
 * short 2 bytes Armazena números inteiros de -32.768 a 32.767
 * int 4 bytes Armazena números inteiros de -2.147.483.648 a 2.147.483.647
 * long 8 bytes Armazena números inteiros de -9.223.372.036.854.775.808 a
 * 9.223.372.036.854.775.807
 * float 4 bytes Armazena números fracionários. Suficiente para armazenar de 6 a
 * 7 dígitos decimais
 * double 8 bytes Armazena números fracionários. Suficiente para armazenar 15
 * dígitos decimais
 * booleano 1 bit Armazena valores verdadeiros ou falsos
 * char 2 bytes Armazena um único caractere/letra ou valores ASCII
 */