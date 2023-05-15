/*
Crie uma lógica que leia um número inteiro e passe para um procedimento
ParOuImpar() que vai verificar e mostrar na tela se o valor passado como 
parâmetro é PAR ou ÍMPAR.
 */


package org.example;

import java.util.Scanner;

public class Ex092 {

    public static void ParOuImpar(int num) {
        if(num % 2 == 0){
            System.out.println("O número digitado é par!");
        }else{
            System.out.println("O número digitado é impar!");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        ParOuImpar(sc.nextInt());
        sc.close();
    }
    
}
