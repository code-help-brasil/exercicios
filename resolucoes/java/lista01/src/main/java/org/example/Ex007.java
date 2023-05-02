/*7.
 Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a 
sua terça parte. ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666
 */

package org.example;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Ex007.main();

    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        Float num = sc.nextFloat();
        System.out.printf("O dobro de %s é %s\n", num, num * 2);
        System.out.printf("A terça parte de %s é %s", num, num / 3);
        sc.close();

    }

}
