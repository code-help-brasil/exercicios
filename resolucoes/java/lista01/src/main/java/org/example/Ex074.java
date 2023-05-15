/*
Crie um programa que preencha automaticamente (usando lógica, não apenas 
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
```
5 3 5 3 5 3 5 3 5 3
0 1 2 3 4 5 6 7 8 9
 */

package org.example;

public class Ex074 {
    public static void main(String[] args) {
        Ex074.main();
    }
    public static void main() {
        int[] vetor = new int[10];
        for(int i = 0;i < vetor.length;i++){
            if(i % 2 == 0){
                vetor[i] = 5;
            }else{
                vetor[i] = 3;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
