/*
Melhore o exercício 96, criando além da função Media() uma outra função 
chamada Situacao(), que vai retornar para o programa principal se o aluno está APROVADO, em RECUPERAÇÃO ou REPROVADO. 
Essa nova função, vai receber como parâmetro o resultado retornado pela função Media()
*/

package org.example;

import java.util.Scanner;

public class Ex100 {

    public static Float Media(Float nota1, Float nota2) {
        Float media = (Float) (nota1 + nota2) / 2;
        return media;
    }

    public static String Situacao(float resultado) {
        if (resultado >= 6) {
            return "Aprovado";
        } else if (resultado >= 4) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        Float nota1 = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        Float nota2 = sc.nextFloat();

        Float media = Media(nota1, nota2);

        System.out.print("A média é : " + media);

        System.out.print(Situacao(media));

        sc.close();
    }

}
