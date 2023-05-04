/*
 Desenvolva um programa que mostre na tela a seguinte contagem:
```
100 95 90 85 80 ... 0 Acabou!
 */



package org.example;

public class Ex041 {
    public static void main(String[] args) {
        Ex041.main();
    }
    public static void main() {
        int i = 100;
        while (i >= 0) {
            System.out.println(i);
            i -= 5;
        }
        System.out.println("Acabou!");
        
    }
    
}
