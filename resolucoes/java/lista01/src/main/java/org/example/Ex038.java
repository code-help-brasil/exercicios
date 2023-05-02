/*
Escreva um programa que mostre na tela a seguinte contagem:
    6 7 8 9 10 11 Acabou!
*/

public class Ex038
{  
    public void run038(){
        for(int i = 6; i <= 11; i++){
            System.out.print(i + " ");
        }
        System.out.println("Acabou!");
    }
    
    public static void main(String[] args){
        new Exercicios().run038();
    }
}
