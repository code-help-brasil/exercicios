/*Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1, 
marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo:
```
30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]... */

package org.example;

import java.util.Scanner;

public class Ex043 {
    public static void main(String[] args) {
        Ex043.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int i = 30;
        while (i >= 0) {
            if (i % 4 == 0) {
                System.out.printf("[%d]\n", i);
            }else{
                System.out.println(i);
            }
            i--;
        }
        sc.close();
    }

}
