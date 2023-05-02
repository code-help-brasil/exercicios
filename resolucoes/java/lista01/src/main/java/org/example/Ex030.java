/*[DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo 
de triângulo será formado: 
 - EQUILÁTERO: todos os lados iguais
 - ISÓSCELES: dois lados iguais
 - ESCALENO: todos os lados diferentes 
 */

package org.example;

import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        Ex030.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira reta: ");
        Integer reta1 = sc.nextInt();
        System.out.print("Digite a segunda reta: ");
        Integer reta2 = sc.nextInt();
        System.out.print("Digite a terceira reta: ");
        Integer reta3 = sc.nextInt();
        if (reta1 == reta2 && reta2 == reta3 && reta3 == reta1) {
            System.out.print("De acordo com as informaçoes as respectivas retas formaram um triângulo EQUILATERO.");
        } else if (reta1 != reta2 && reta2 != reta3 && reta3 != reta1) {
            System.out.print("De acordo com as informaçoes as respectivas retas formaram um triângulo ESCANELO.");
        } else {
            System.out.print("De acordo com as informaçoes as respectivas retas formaram um triângulo ISOCELES.");
        }
        sc.close();
    }
}
