// Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

use std::io;

fn get_input (name: String) -> f32 {
    println!("Digite um {}:",  name);

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
    let value = get_input("valor em reais".to_string());

    println!("Com R${}, você pode comprar US${}.", value, value / 3.45);
}
