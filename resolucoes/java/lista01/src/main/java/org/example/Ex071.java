/*
Faça um programa que preencha automaticamente um vetor numérico com 8 
posições, conforme abaixo:
```
999 999 999 999 999 999 999 999
 0   1   2   3   4   5   6   7
 */

package org.example;

import java.util.Arrays;

public class Ex071 {
    public static void main(String[] args) {
        Ex071.main();
    }

    public static void main() {
        int[] vetor = new int[8];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 999;
        }
        System.out.println(Arrays.toString(vetor));
    }
}
