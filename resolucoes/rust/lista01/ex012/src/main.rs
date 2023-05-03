// Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.

use std::io;

fn get_input (name: String) -> f32 {
    println!("Digite o {}:",  name);

    loop {
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Failed to read line");
      
        let input = input.trim();
      
        if input.is_empty() {
            println!("Digite um {} válido:", name);
            continue;
        }

        if let Ok(num) = input.parse::<f32>() {
            return num;
        } else {
            println!("Digite um {} válido:", name);
        }
    }
}

fn main() {
    let value = get_input("valor do produto".to_string());

    let percentage_value = value * 0.05;

    println!("O produto com 5% de desconto fica R${}.", value - percentage_value);
}
