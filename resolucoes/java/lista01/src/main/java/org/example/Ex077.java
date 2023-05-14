/*
 Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No 
final, mostre uma listagem com todos os nomes informados, na ordem inversa 
daquela em que eles foram informados.
 */

package org.example;

import java.util.Scanner;

public class Ex077 {
    public static void main(String[] args) {
        Ex077.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[7];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite seu nome: ");
            nomes[i] = sc.nextLine();
        }
        for(int i = nomes.length - 1;i >= 0;i--){
            System.out.print(nomes[i] + " ");
        }
        sc.close();
    }
}
