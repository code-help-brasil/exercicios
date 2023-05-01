/*Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o 
alistamento.
- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do 
alistamento. */

package org.example;

import java.time.Year;
import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Ex022.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = Year.now().getValue() - anoNascimento;

        if (idade < 18) {
            int anosFaltantes = 18 - idade;
            System.out.printf("Você tem %d anos. Ainda faltam %d anos para o alistamento militar.\n", idade,
                    anosFaltantes);
        } else if (idade == 18) {
            System.out.println("Você tem 18 anos. É hora de se alistar!");
        } else {
            int anosPassados = idade - 18;
            System.out.printf("Você tem %d anos. Já se passaram %d anos do alistamento militar.\n", idade,
                    anosPassados);
        }
        sc.close();
    }

}
