/*
 Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
- Quantos homens foram cadastrados
- Quantas mulheres foram cadastradas
- A média de idade do grupo
- A média de idade dos homens
- Quantas mulheres tem mais de 20 anos
 */

package org.example;

import java.util.Scanner;

public class Ex053 {
    public static void main(String[] args) {
        Ex053.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        int contador = 0; 
        int mulheres = 0;
        int homens = 0;
        int mulheres_vinte = 0;
        int somaIdades = 0;
        int somaIdades_homem = 0;

        while (contador <= 5) {
            contador++;
            System.out.printf("\n---- %dº Pessoa ----\n", contador);
            System.out.print("Qual sua idade?: ");
            int idade = sc.nextInt();
            somaIdades += idade;
            sc.nextLine(); 

            System.out.print("Qual seu sexo (feminino ou masculino)?: ");
            String genero = sc.nextLine();

            if (genero.equalsIgnoreCase("feminino")) { 
                mulheres++;
                if (idade >= 20) {
                    mulheres_vinte++;
                }
            } else {
                homens++;
                somaIdades_homem += idade; 
        }

        double mediaIdades = (double) somaIdades / 5; 
        double mediaIdadesHomem = (double) somaIdades_homem / homens; 
                                                                      

        System.out.printf("\nForam cadastrados %d homens e %d mulheres.\n", homens, mulheres);
        System.out.printf("A média de idade do grupo é %.2f.\n", mediaIdades);
        System.out.printf("A média de idade dos homens é %.2f.\n", mediaIdadesHomem);
        System.out.printf("%d mulheres têm mais de 20 anos.\n", mulheres_vinte);

    }
    sc.close();

}
}
