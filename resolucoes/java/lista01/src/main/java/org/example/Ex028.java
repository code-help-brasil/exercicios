/*Faça um programa que leia a largura e o comprimento de um terreno 
retangular, calculando e mostrando a sua área em m². O programa também 
devemostrar a classificação desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m² = TERRENO POPULAR
- Entre 100m² e 500m² = TERRENO MASTER
- Acima de 500m² = TERRENO VIP */

package org.example;

import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        Ex028.main();

    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a largura do terreno?: ");
        Float largura = sc.nextFloat();
        System.out.print("Qual comprimento do terreno?: ");
        Float comprimento = sc.nextFloat();
        Float areaTerreno = largura * comprimento;
        if (areaTerreno > 500) {
            System.out.print("TERRENO VIP");
        } else if (areaTerreno <= 500 && areaTerreno > 100) {
            System.out.print("TERRENO MASTER");
        } else {
            System.out.print("TERRENO POPULAR");
        }
        sc.close();

    }

}
