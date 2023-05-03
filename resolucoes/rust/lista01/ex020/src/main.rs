// Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.

use std::io;

fn get_input (name: String) -> i32 {
    println!("Digite um {}:",  name);

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
    let number = get_input("número".to_string());

    println!("O número é {}.", if number % 2 == 0 { "PAR" } else { "ÍMPAR" });
}
