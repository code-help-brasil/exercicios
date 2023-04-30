import java.util.Scanner;

public class Ex003
{  
    public void run003(){
        Scanner inputUtilizador = new Scanner(System.in);
        
        System.out.println("Nome do Funcionário: ");
        String nome = inputUtilizador.nextLine();
        
        System.out.println("Salário: ");
        Double salario = inputUtilizador.nextDouble(); // Teste com por exemplo 1304.34
        
        System.out.println("O funcionário " + nome + " tem um salário de R$" + salario + " em Junho.");
    }
    
    public static void main(String[] args){
        new Exercicios().run003();
    }
}
