/* Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina. ex:
```
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
```*/

package org.example;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Ex005.main();

    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        Float nota1 = sc.nextFloat();
        System.out.print("Nota 2: ");
        Float nota2 = sc.nextFloat();
        System.out.printf("A média entre %s e %s é igual a %s", nota1, nota2, (nota1 + nota2) / 2);
        sc.close();

    }

}
