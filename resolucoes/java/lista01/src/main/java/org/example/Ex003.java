/*
Crie um programa que leia o nome e o salário de um funcionário,
mostrando no final uma mensagem. ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho. 
*/

package org.example;

import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args) {
        Ex003.main();

    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual nome do funcionario?: ");
        String nome = sc.nextLine();
        System.out.printf("Qual o salário de(a) %s ?: ", nome);
        Float salario = Float.parseFloat(sc.nextLine());
        System.out.printf("Nome do Funcionário: %s ", nome);
        System.out.printf("Salário: R$%s %n", salario);
        System.out.printf("funcionário %s tem um salário de R$%s em Junho.%n", nome, salario);
        sc.close();
    }

}
