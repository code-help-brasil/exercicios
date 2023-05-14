/*
Crie um programa que melhore o procedimento Gerador() da questão anterior 
para que mostre uma mensagem personalizada, passada como parâmetro.
Ao chamar Gerador("Aprendendo Portugol") aparece:
+-------=======------+
 Aprendendo Portugol 
+-------=======------+
 */

package org.example;

import java.util.Scanner;

public class Ex087 {
    public static void gerador(String mensagem) {

        System.out.println("+-------=======------+");

        System.out.println(" " + mensagem + " ");

        System.out.println("+-------=======------+");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma mensagem: ");
        gerador(sc.nextLine());
        sc.close();
    }
    
}
