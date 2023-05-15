/*
 Refaça o exercício 90, só que agora em forma de função Somador(), que vai 
receber dois parâmetros e vai retornar o resultado da soma entre eles para o 
programa principal.
 */



package org.example;

import java.util.Scanner;

public class Ex095 {
    public static int somador(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite um número: ");
        int num2 = sc.nextInt();

        System.out.println(somador(num1, num2));
        sc.close();
    }
}
