package org.example;

import java.util.Scanner;

public class Ex059 {
    public static void main(String[] args) {
        Ex059.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro Valor: ");
        Float inicio = sc.nextFloat();

        System.out.print("Digite o último Valor: ");
        Float fim = sc.nextFloat();

        System.out.print("Digite o incremento: ");
        Float incremento = sc.nextFloat();

        System.out.print("Contagem: ");

        for (Float i = inicio; i <= fim; i += incremento) {
            if (i + incremento > fim) {
                System.out.print(fim);
            } else {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
