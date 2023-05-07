/*
 Crie um programa que mostre na tela a seguinte contagem, usando a estrutura “faça enquanto”
```
0 3 6 9 12 15 18 21 24 27 30 Acabou!
 */

package org.example;

public class Ex061 {
    public static void main(String[] args) {
        Ex061.main();
    }

    public static void main() {
        int contador = 0;
        do {
            System.out.print(contador + " ");
            contador += 3;

        } while (contador <= 30);

    }

}
