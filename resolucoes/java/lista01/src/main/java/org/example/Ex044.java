/*Crie um algoritmo que leia o valor inicial da contagem, o valor final e o 
incremento, mostrando em seguida todos os valores no intervalo: ex:
```
Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou! */



package org.example;

import java.util.Scanner;

public class Ex044 {
    public static void main(String[] args) {
        Ex044.main();

    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual valor inicial da contagem?: ");

        int inicial = sc.nextInt();

        System.out.printf("Qual valor final?: ");

        int valor_final = sc.nextInt();

        System.out.print("Qual incremento?: ");

        int incremento = sc.nextInt();
        
        while (inicial <= valor_final){
            System.out.println(inicial);
            inicial += incremento;
        }
        System.out.print("Acabou!");
      
        sc.close();
        
    }
}
