/* 
 * Refaça o exercício 91, só que agora em forma de função Maior(),
 *  mas faça uma adaptação que vai receber TRÊS números como parâmetro
 *  e vai retornar qual foi o maior entre eles.
 */

package org.example;

import java.util.Scanner;

public class Ex097 {

    public static Float Maior(Float x, Float y, Float z) {
        Float[] array = { x, y, z };
        Float maior = Float.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Float num1 = sc.nextFloat();

        System.out.print("Digite um número: ");
        Float num2 = sc.nextFloat();

        System.out.print("Digite um número: ");
        Float num3 = sc.nextFloat();

        System.out.print("O maior valor é :" + Maior(num1, num2, num3));
        sc.close();

    }

}