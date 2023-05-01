/*
Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando na tela uma das mensagens abaixo:
    O primeiro valor é o maior
    O segundo valor é o maior
    Não existe valor maior, os dois são iguais
*/


import java.util.Scanner;

public class Ex026
{  
    public void run026(){
        Scanner inputUtilizador = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número.");
        int primeiroNumero = inputUtilizador.nextInt();
        
        System.out.println("Digite o segundo número.");
        int segundoNumero = inputUtilizador.nextInt();
        
        //Basicamente o que acontece aqui é que verificamos se o primeiro numero é maior, se não for 
        //verifica se ele é menor, e se também não for, quer dizer que eles são iguais
        if(primeiroNumero > segundoNumero){
            System.out.println("O primeiro valor é o maior.");
        }
        else if(primeiroNumero < segundoNumero){
            System.out.println("O segundo valor é o maior.");
        }
        else{
            System.out.println("Não existe valor maior, os dois são iguais.");
        }
    }
    
    public static void main(String[] args){
        new Exercicios().run026();
    }
}
