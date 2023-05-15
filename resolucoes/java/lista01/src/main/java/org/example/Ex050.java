/*
Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e 
mostre na tela:
- Quais foram os números sorteados
- Quantos números estão acima de 5
- Quantos números são divisíveis por 3
 */

package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Ex050 {
    public static void main(String[] args) {
        Ex050.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random(11);
        int contador = 0;
        int maior_5 = 0;
        int divi_3 = 0;
        ArrayList<Integer> lista = new ArrayList<>();
        while (contador <= 20) {
            int numero = rand.nextInt(11);
            lista.add(numero);
            if (numero % 3 == 0) {
                divi_3++;
            }
            if (numero > 5) {
                maior_5++;
            }
            contador++;
        }
        System.out.println("A lista é: " + lista);
        System.out.printf("Foram registrados %d números maiores que 5\n", maior_5);
        System.out.printf("Foram resgistrados %d números divisiveis por 3", divi_3);
        sc.close();
    }

}