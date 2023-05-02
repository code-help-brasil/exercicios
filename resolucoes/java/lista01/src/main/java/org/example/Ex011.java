/* Desenvolva uma lógica que leia os valores de
 A, B e C 
de uma equação do 
segundo grau e mostre o valor de Delta.*/

// Delta = B**2 - 4*a*c

package org.example;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Ex011.main();
    }

    public static void main() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual valor de A: ");
        Integer a = sc.nextInt();
        System.out.print("Qual valor de B: ");
        Integer b = sc.nextInt();
        System.out.print("Qual valor de C: ");
        Integer c = sc.nextInt();
        Double delta = Math.pow(b,2) - 4*a*c;
        System.out.printf("Delta é: %s",delta);
        sc.close();
     
    }
}
