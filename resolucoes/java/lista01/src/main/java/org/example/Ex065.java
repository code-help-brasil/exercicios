/*
Desenvolva um programa usando a estrutura “para” que mostre na tela a 
seguinte contagem: ex:
```
100 90 80 70 60 50 40 30 20 10 0 Acabou!
 */

package org.example;

public class Ex065 {
    public static void main(String[] args) {
        Ex065.main();
    }

    public static void main() {
        for (int i = 100; i >= 0; i -= 10) {
            System.out.print(i + " ");
        }
        System.out.println("Acabou!");
    }

}
