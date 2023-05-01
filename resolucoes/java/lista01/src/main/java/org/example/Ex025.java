/*[DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta. 
Analise seus comprimentos e diga se é possível formar um triângulo com essas 
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento 
de cada lado deve ser menor que a soma dos outros dois. */

package org.example;

import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Ex025.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do primeiro segmento de reta: ");
        double a = sc.nextDouble();

        System.out.print("Digite o tamanho do segundo segmento de reta: ");
        double b = sc.nextDouble();

        System.out.print("Digite o tamanho do terceiro segmento de reta: ");
        double c = sc.nextDouble();
        // && == 'ou'
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os segmentos de reta informados podem formar um triângulo.");
        } else {
            System.out.println("Os segmentos de reta informados nao podem formar um triângulo.");
        }
        sc.close();
    }

}
