// Faça um programa que leia 7 números inteiros e no final mostre o somatório entre eles.

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
    let mut numbers: Vec<i32> = vec![];

    for n in 1..=7 {
        let number = get_int(format!("o {}º número", n).as_str());

        numbers.push(number);
    }

    println!("A soma dos números é: {}.", numbers.iter().sum::<i32>())
}
