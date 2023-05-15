/*
Faça um programa que possua uma função chamada Potencia(), que vai receber 
dois parâmetros numéricos (base e expoente) e vai calcular o resultado da 
exponenciação.
Ex: Potencia(5,2) vai calcular 52 = 25
 */

package org.example;

public class Ex099 {
    
    public static int Potencia(int x, int y) {
        int resultado = x;
        for (int i = 1; i < y; i++) {
            resultado *= x;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.print(Potencia(12, 2));
    }

}
