// A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
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
    let km = get_input("quilômetros percorridos".to_string());
    let days = get_input("dias alugados".to_string());

    let total = (km * 0.2) + (days * 90.0);

    println!("O total ficou R${}.", total);
}
