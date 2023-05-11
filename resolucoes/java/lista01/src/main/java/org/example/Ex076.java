/*Crie um programa que preencha automaticamente um vetor numérico com 7
números gerados aleatoriamente pelo computador e depois mostre os valores 
gerados na tela. */

package org.example;

import java.util.Random;

public class Ex076 {
    public static void main(String[] args) {
        Ex076.main();
    }

    public static void main() {
        int[] vetor = new int[7];
        Random numero = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = numero.nextInt(100);
        }
        for (int i = 0; i < vetor.length; i++) {
            if(i == 6){
            System.out.print(vetor[i] + ".");
        }else{
            System.out.print(vetor[i] + ", ");
        }
    }   

    }
}
