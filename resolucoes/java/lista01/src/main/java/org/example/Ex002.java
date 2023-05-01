/***
 * Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas para ela:
 * Ex:
 * Qual é o seu nome? João da Silva
 * Olá João da Silva, é um prazer te conhecer!
 * */

package org.example;

import java.util.Scanner;

public class Ex002 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Qual é o seu nome?: ");
    String nome = sc.nextLine();
    System.out.println("Olá "+ nome +" é um prazer te conhecer!");
    sc.close();
   
   }
}
