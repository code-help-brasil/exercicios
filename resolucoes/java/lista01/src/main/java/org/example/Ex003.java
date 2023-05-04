




package org.example;

import java.util.Scanner; //Precisa importar isso para ser capaz de ler

public class Ex003{ 
    public static void main(String[] args){
        Ex003.main();
    } 
    public static void main(){
        Scanner sc = new Scanner(System.in);  // Cria um objeto para ler variáveis
        System.out.println("Qual é o seu nome?");
    
        String nome = sc.nextLine();  // Lê o que o utilizador digitou
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");  // Escreve no ecrã juntamente com a variável
        sc.close();
    }
    
    
}