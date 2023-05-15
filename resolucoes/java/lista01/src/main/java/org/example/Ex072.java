/*

Crie um programa que preencha automaticamente 
(usando lógica, não apenas atribuindo diretamente) 
um vetor numérico com 10 posições, conforme abaixo:
5 10 15 20 25 30 35 40 45 50
0  1    2   3  4  5  6  7  8 9

*/

package org.example;

    public class Ex072 {
        public static void main(String[] args) {
            Ex072.main();
        }
        
        public static void main() {
            int[] vetor = new int[10];
            int numero = 5;
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = numero;
                numero += 5;
            }                                          //é básico não fode
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i]);
                if (i < vetor.length - 1) {
                    System.out.print(", ");
                }
            }
        }

}
