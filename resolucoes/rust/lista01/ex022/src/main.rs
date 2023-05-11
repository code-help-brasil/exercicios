// Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
// Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
// Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do alistamento.

use std::io;
use chrono::prelude::*;

fn get_input (name: String) -> i32 {
    println!("Digite o {}:",  name);

    loop {
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Failed to read line");
      
        let input = input.trim();
      
        if input.is_empty() {
            println!("Digite um número válido:");
            continue;
        }

        if let Ok(num) = input.parse::<i32>() {
            return num;
        } else {
            println!("Digite um número válido:");
        }
    }
}

fn main() {
    let year = get_input("ano de nascimento".to_string());

    let current_year = Local::now().year();
    let age = current_year - year;

    println!("Ele tem {} anos e {}", age, if age < 18 { format!("faltam {} anos para o alistamento.", 18 - age) } else { format!("passou pelo alistamento faz {} anos.", age - 18) });
}
