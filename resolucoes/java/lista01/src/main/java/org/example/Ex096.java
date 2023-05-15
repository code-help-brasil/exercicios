/*
 Crie um programa que tenha uma função Media(),
 que vai receber as 2 notas de um aluno e retornar a sua média para o programa principal.
 */


package org.example;

import java.util.Scanner;

public class Ex096 {

    public static Float Media(Float nota1,Float nota2) {
        Float media = (Float) (nota1+nota2) / 2;
        return media;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        Float nota1 = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        Float nota2 = sc.nextFloat();

        System.out.print(Media(nota1,nota2));

        sc.close();
    }
}
