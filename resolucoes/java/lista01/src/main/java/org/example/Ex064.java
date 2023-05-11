/*
Desenvolva um programa usando a estrutura “para” que mostre na tela a 
seguinte contagem:
```
0 5 10 15 20 25 30 35 40 Acabou!
 */

package org.example;

public class Ex064 {
    public static void main(String[] args) {
        Ex064.main();
    }

    public static void main() {
        for (int i = 0; i <= 40; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println("Acabou!");
    }
}
