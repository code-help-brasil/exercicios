/*
 [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência de Fibonacci:
```
1 1 2 3 5 8 13 21...
 */

package org.example;

public class Ex070 {
    public static void main(String[] args) {
        Ex070.main();
    }

    public static void main() {
        int atual = 1;
        int anterior = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print(atual + " ");

            int proximo = atual + anterior;

            anterior = atual;

            atual = proximo;

        }

    }
}
