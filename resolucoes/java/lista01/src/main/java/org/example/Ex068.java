/*
Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura 
“para”. 
- No final, mostre na tela:
- Quantas mulheres foram cadastradas
- Quantos homens pesam mais de 100Kg
- A média de peso entre as mulheres 
- O maior peso entre os homens
 */

package org.example;

import java.util.Scanner;

public class Ex068 {
    public static void main(String[] args) {
        Ex068.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int mulheres = 0;
        int pesoMulheres = 0;
        int homens100 = 0;
        int pesoHomens = -1;
        for (int i = 0; i < 8; i++) {
            System.out.print("Qual seu sexo: ");
            String genero = sc.nextLine();
            System.out.print("Qual seu peso: ");
            int peso = sc.nextInt();
            sc.nextLine();
            if (genero.equals("feminino")) {
                mulheres++;
                pesoMulheres += peso;
            } else if (genero.equals("masculino")) {
                if (peso > 100) {
                    homens100++;
                }
                if (peso > pesoHomens) {
                    pesoHomens = peso;
                }
            }
        }

        double mediaPesoMulheres = (double) pesoMulheres / mulheres;

        System.out.printf("Quantidade de mulheres: %d\n", mulheres);
        System.out.printf("Quantidade de homens com mais de 100Kg: %d\n", homens100);
        System.out.printf("Média de peso das mulheres: %.2f\n", mediaPesoMulheres);
        System.out.printf("Maior peso entre os homens: %d\n", pesoHomens);

        sc.close();
    }
}
