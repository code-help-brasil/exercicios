/*
Crie um programa que leia duas notas de um aluno e calcule a sua média, mostrando uma mensagem no final, de acordo com a média atingida:
    Média até 4.9: REPROVADO
    Média entre 5.0 e 6.9: RECUPERAÇÃO
    Média 7.0 ou superior: APROVADO
*/

import java.util.Scanner;

public class Ex027
{  
    public void run027(){
        Scanner inputUtilizador = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota.");
        double primeiraNota = inputUtilizador.nextDouble();
        
        System.out.println("Digite a segunda nota.");
        double segundaNota = inputUtilizador.nextDouble();
        
        //Cálculo da média
        double media = (primeiraNota + segundaNota)/2;
        
        if(media <= 4.9){
            System.out.println("Reprovado");
        }
        else if(media >= 5 && media <= 6.9){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Aprovado");
        }
    }
    
    public static void main(String[] args){
        new Exercicios().run027();
    }
}
