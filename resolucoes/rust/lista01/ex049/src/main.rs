// Crie um programa que leia 6 números inteiros e no final mostre quantos deles são pares e quantos são ímpares.

use std::io;

fn get_input() -> String {
    loop {
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Failed to read line");

        let input = input.trim().to_string();

        if input.is_empty() {
            println!("Digite um número válido:");
            continue;
        }

        return input
    }
}

fn get_int(name: &str) -> i32 {
    println!("Digite {}:",  name);
    
    loop {
        let input = get_input();

        if let Ok(num) = input.parse::<i32>() {
            return num;
        } else {
            println!("Digite um número válido:");
        }
    }
}

fn main() {
    let mut even = 0;
    let mut odd = 0;

    for n in 1..=6 {
        let number = get_int(format!("o {}º número", n).as_str());

        if number % 2 == 0 {
            even += 1;
        } else {
            odd += 1;
        }
    }

    println!("{} números são par e {} são ímpar.", even, odd);
}
