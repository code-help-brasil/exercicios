/*Desenvolva um aplicativo que mostre na tela o resultado da expressão 
```
500 + 450 + 400 + 350 + 300 + ... + 50 + 0
 */

package org.example;

public class Ex047 {
    public static void main(String[] args) {
        Ex047.main();
    }

    public static void main() {

        int inicial = 500;

        int soma = 0;
        
        while (inicial >= 0) {
            soma += inicial;
            inicial -= 50;
        }
        System.out.printf("A soma desta sequencia é %d", soma);
    }

}
