/*Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas. ex: 
```
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km           1857.2dm
1.8572Hm           18572.0cm
18.572Dam           185720.0mm */

package org.example;

import java.util.Scanner;

public class Ex008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma distância em metros: ");
        double metros = sc.nextDouble();

        double km = metros / 1000;
        double dm = metros * 10;
        double hm = metros / 100;
        double cm = metros * 100;
        double dam = metros / 10;
        double mm = metros * 1000;

        System.out.printf("A distância de %.2fm corresponde a:%n", metros);
        System.out.printf("%.5fKm\t%.1fdm%n", km, dm);
        System.out.printf("%.4fHm\t%.1fcm%n", hm, cm);
        System.out.printf("%.3fDam\t%.1fmm%n", dam, mm);

        sc.close();
    }

}

