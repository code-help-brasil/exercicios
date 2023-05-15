/*
[DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado 
Fibonacci() que recebe um único valor inteiro como parâmetro, indicando quantos termos da sequência serão mostrados na tela.
 O seu procedimento deve receber esse valor e mostrar a quantidade de elementos solicitados.
Obs: Use os exercícios 70 e 75 para te ajudar na solução
```
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM
```

 */

package org.example;

import java.util.Scanner;

public class Ex094 {
    public static void Fibonacci(int fim) {
        int atual = 1;
        int anterior = 0;
        int proximo = 0;
        while (atual <= fim) {

            System.out.print(atual + " ");
            proximo = atual + anterior;

            anterior = atual;

            atual = proximo;
        }
        System.out.println("FIM");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual último número: ");

        Fibonacci(sc.nextInt());
        
        sc.close();
    }

}
