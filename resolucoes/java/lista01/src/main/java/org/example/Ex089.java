/*
 Crie um programa que melhore o procedimento Gerador() da questão anterior 
para que o programador possa escolher uma entre três bordas:
```
 +-------=======------+ Borda 1
 ~~~~~~~~:::::::~~~~~~~ Borda 2
 <<<<<<<<------->>>>>>> Borda 3
```
ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
```
~~~~~~~~:::::::~~~~~~~
 Portugol Studio
 Portugol Studio
 Portugol Studio
~~~~~~~~:::::::~~~~~~~
 */

package org.example;

import java.util.Scanner;

public class Ex089 {

    public static void gerador(String mensagem, int vezes, int estilo) {
        if (estilo == 1) {
            System.out.println("+-------=======------+");

            for (int i = 0; i < vezes; i++) {
                System.out.println(" " + mensagem + " ");
            }

            System.out.println("+-------=======------+");
        } 

        else if (estilo == 2) {
            System.out.println("~~~~~~~~:::::::~~~~~~~");

            for (int i = 0; i < vezes; i++) {
                System.out.println(" " + mensagem + " ");
            }

            System.out.println("~~~~~~~~:::::::~~~~~~~");

        }

        else{
            System.out.println("<<<<<<<<------->>>>>>>");

            for (int i = 0; i < vezes; i++) {
                System.out.println(" " + mensagem + " ");
            }

            System.out.println("<<<<<<<<------->>>>>>>");
        }
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma mensagem: ");
        String msg = sc.nextLine();
        System.out.print("Digite quantas vezes você deseja que a mensagem apareça: ");
        int vezes = sc.nextInt();
        System.out.print("Escolha a borda 1,2 ou 3: ");
        int estilo = sc.nextInt();
        gerador(msg, vezes, estilo);
        sc.close();

    }
}
