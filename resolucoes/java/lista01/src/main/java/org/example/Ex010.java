/*Faça um algoritmo que leia a largura e altura de uma parede, calcule e 
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
 sabendo que cada litro de tinta pinta uma área de 2metros quadrados. */

package org.example;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Ex010.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual largura da parede?: ");
        Float largura = sc.nextFloat();
        System.out.print("Qual altura da parede?: ");
        Float altura = sc.nextFloat();
        Float area = altura * largura;
        System.out.printf(
                "A área da parede é %sm sabendo que se usa 2 litros será utlizado %s litros de tinta para pinta-lá",
                area,
                area / 2);
        sc.close();

    }
}
