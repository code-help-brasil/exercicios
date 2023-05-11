/*Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou! */


package org.example;

public class Ex040 {
    public static void main(String[] args) {
        Ex040.main();
    }
    public static void main() {
        int i = 0;
        while (i <= 18) {
            System.out.println(i);
            i += 3;
        }
        System.out.println("Acabou!");
        
    }

    
}
