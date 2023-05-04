/*
Faça um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua área em m². O programa também devemostrar a classificação desse terreno, de acordo com a lista abaixo:
    Abaixo de 100m² = TERRENO POPULAR
    Entre 100m² e 500m² = TERRENO MASTER
    Acima de 500m² = TERRENO VIP
*/


import java.util.Scanner;

public class Ex028
{  
    public void run028(){
        Scanner inputUtilizador = new Scanner(System.in);
        
        System.out.println("Digite a largura do terreno.");
        double largura = inputUtilizador.nextDouble();
        
        System.out.println("Digite o comprimento do terreno.");
        double comprimento = inputUtilizador.nextDouble();
        
        //Cálculo em m² da área do terreno
        double area = largura * comprimento;
        
        if(area < 100){
            System.out.println("TERRENO POPULAR");
        }
        else if(area > 100 && area < 500){
            System.out.println("TERRENO MASTER");
        }
        else{
            System.out.println("TERRENO VIP");
        }
    }
    
    public static void main(String[] args){
        new Exercicios().run028();
    }
}
