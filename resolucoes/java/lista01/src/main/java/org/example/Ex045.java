package org.example;

/*

O programa acima vai ter um problema quando digitarmos o primeiro valor 
maior que o último. Resolva esse problema com um código que funcione em qualquer situação.

 */

import java.util.Scanner;

public class Ex045 {
    public static void main(String[] args) {
        Ex045.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual valor inicial da contagem?: ");
        int inicial = sc.nextInt();

        System.out.printf("Qual valor final?: ");
        int valor_final = sc.nextInt();

        System.out.print("Qual incremento?: ");
        int incremento = sc.nextInt();
        if (inicial < valor_final) {
            while (inicial <= valor_final) {

                System.out.println(inicial);
                inicial += incremento;
            }
        } else {
            while (inicial >= valor_final) {

                System.out.println(inicial);
                inicial -= incremento;
            }

        }

        System.out.print("Acabou!");

        sc.close();

    }
}
