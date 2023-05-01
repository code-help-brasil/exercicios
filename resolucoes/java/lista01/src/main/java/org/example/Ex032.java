/*Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa.
O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar.
Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do salário ou então,
o empréstimo será negado. */

package org.example;

import java.util.Scanner;

public class Ex032 {
    public static void main(String[] args) {
        Ex032.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da casa: R$");
        double valorCasa = sc.nextDouble();

        System.out.print("Salário do comprador: R$");
        double salario = sc.nextDouble();

        System.out.print("Quantidade de anos para pagar: ");
        int anos = sc.nextInt();

        double valorPrestacao = valorCasa / (anos * 12); // valor da prestação mensal
        double limiteSalario = salario * 0.3; // limite de 30% do salário para a prestação

        if (valorPrestacao <= limiteSalario) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo negado!");
        }

        sc.close();
    }

}
/*
byte 1 byte Armazena números inteiros de -128 a 127
short 2 bytes Armazena números inteiros de -32.768 a 32.767
int 4 bytes Armazena números inteiros de -2.147.483.648 a 2.147.483.647
long 8 bytes Armazena números inteiros de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
float 4 bytes Armazena números fracionários. Suficiente para armazenar de 6 a 7 dígitos decimais
double 8 bytes Armazena números fracionários. Suficiente para armazenar 15 dígitos decimais
booleano 1 bit Armazena valores verdadeiros ou falsos
char 2 bytes Armazena um único caractere/letra ou valores ASCII
*/