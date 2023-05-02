/* *[DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um fumante. 
Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou.
 Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida 
 um fumante perderá e exiba o total em dias.
*/

package org.example;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Ex016.main();

    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite há quantos anos você fuma: ");
        int anos = sc.nextInt();
        System.out.print("Digite a quantidade de cigarros fumados por dia: ");
        int cigarros = sc.nextInt();
        int diasPerdidos = anos * 365 * cigarros;
        System.out.printf(
                "Uma pessoa que fuma durante %d anos, %d cigarros por dia perderá %d minutos de vida, equivalente a %d dias",
                anos, cigarros, diasPerdidos, diasPerdidos / 1440);
        sc.close();

    }

}
