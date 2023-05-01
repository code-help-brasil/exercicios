package org.example;

import java.util.Scanner;


public class Ex003 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual nome do funcionario?: ");
        String nome = sc.nextLine();
        System.out.println("Qual o salário de(a)" + nome + ": ");
        Float salario = Float.parseFloat(sc.nextLine());
        System.out.println("Nome do Funcionário:" + nome);
        System.out.println("Salário: R$" + salario);
        sc.close();
    }
}
