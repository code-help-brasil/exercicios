// Crie um programa que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.
use std::io;

fn get_input (name: String) -> f32 {
    println!("Digite quantos {}:",  name);

    loop {
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Failed to read line");
      
        let input = input.trim();
      
        if input.is_empty() {
            println!("Digite um número válido:");
            continue;
        }

        if let Ok(num) = input.parse::<f32>() {
            return num;
        } else {
            println!("Digite um número válido:");
        }
    }
}


fn main() {
    let days = get_input("dias trabalhados".to_string());

    let total = days * 200.0;

    println!("O salário é de R${}.", total);
}
