/*
 Crie um programa que preencha automaticamente (usando lógica, não apenas 
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
```
9 8 7 6 5 4 3 2 1 0
0 1 2 3 4 5 6 7 8 9
 */

package org.example;

public class Ex073 {
    public static void main(String[] args) {
        Ex073.main();
    }

    public static void main() {
        int[] vetor = new int[10];
        int contador = 9;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = contador;
            contador--;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }

}
