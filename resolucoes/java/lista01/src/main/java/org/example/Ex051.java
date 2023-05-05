/*
Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela qual foi o maior e qual foi o menor preço digitados.
 */

 package org.example;

 import java.util.Scanner;
 
 public class Ex051 {
     public static void main(String[] args) {
         Ex051.main();
     }
 
     public static void main() {
 
         Scanner sc = new Scanner(System.in);
 
         int i = 1;
         Float maior = Float.MIN_VALUE;
         Float menor = Float.MIN_VALUE;
 
         while (i <= 8) {
             System.out.print("Digite o preco do produto: ");
             Float preco = sc.nextFloat();
             if (preco > maior) {
                 maior = preco;
             }
             if (i == 1) {
                 menor = preco;
             } else if (preco < menor) {
                 menor = preco;
             }
             i++;
         }
         System.out.printf("O Produto mais caro foi de R$%d e o mais barato foi de R$%d",maior,menor);
         sc.close();
     }
 }
 
