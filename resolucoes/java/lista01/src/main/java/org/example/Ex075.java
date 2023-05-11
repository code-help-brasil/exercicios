/*
Crie um programa que preencha automaticamente (usando lógica, não apenas 
atribuindo diretamente) um vetor numérico com 15 posições com os primeiros 
elementos da sequência de Fibonacci:
```
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
 */

package org.example;

public class Ex075 {
    public static void main(String[] args) {
        Ex075.main();
    }

    public static void main() {
        int[] vetor = new int[15];
        int atual = 1;
        int anterior = 0;
        for (int i = 0; i < vetor.length; i++) {

            int proximo = atual + anterior;
            vetor[i] = proximo;
            anterior = atual;
            atual = proximo;

        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}
