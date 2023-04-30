import java.util.Scanner; //Precisa importar isso para ser capaz de ler

public class Ex002{  
    public void run002(){
        Scanner inputUtilizador = new Scanner(System.in);  // Cria um objeto para ler variáveis
        System.out.println("Qual é o seu nome?");
    
        String nome = inputUtilizador.nextLine();  // Lê o que o utilizador digitou
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");  // Escreve no ecrã juntamente com a variável
    }
    
    public static void main(String[] args){
        new Exercicios().run002();
    }
}
