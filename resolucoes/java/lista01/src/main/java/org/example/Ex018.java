/*Faça um programa que leia o ano de nascimento de uma pessoa, 
calcule a idade dela e depois mostre se ela pode ou não votar. */

package org.example;

import java.util.Scanner;
import java.time.Year;

public class Ex018 {
    public static void main(String[] args) {
        Ex018.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual ano você nasceu ?: ");
        int anoNasc = sc.nextInt();
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNasc;

        if (idade < 16) {
            System.out.println("Você é menor de idade e não pode votar");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Voto para você é obrigatório");
        } else {
            System.out.println("O voto para você é opcional");
        }
        sc.close();

    }
}
