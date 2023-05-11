/*Faça um algoritmo que pergunte ao usuário um número inteiro e positivo 
qualquer e mostre uma contagem até esse valor:
```
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou! */




package org.example;

import java.util.Scanner;

public class Ex042 {
    public static void main(String[] args) {
        Ex042.main();
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int i = sc.nextInt();
        int j = 1;
        while (j != i ) {
            System.out.println(j);
            j += 1;
        }
        System.out.println("Acabou!");
        sc.close();
        
    }
    
}
