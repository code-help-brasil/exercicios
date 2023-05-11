/*
 Crie um programa que leia vários números pelo teclado e mostre no final o 
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado
 */

package org.example;

import java.util.Scanner;

public class Ex056 {
    public static void main(String[] args) {
        Ex056.main();

    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int somaNumeros = 0;
        while (true) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            somaNumeros += numero;
            if (numero == 1111) {
                break;
            }

        }
        System.out.println("O somatório dos números é: " + somaNumeros);
        System.out.println("Programa encerrado.");
        sc.close();

    }
}
