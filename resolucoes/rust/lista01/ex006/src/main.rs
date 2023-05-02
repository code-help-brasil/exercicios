// Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.

use std::io;

fn get_input (name: String) -> i32 {
    println!("Digite um {}:",  name);

    loop {
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Failed to read line");
      
        let input = input.trim();
      
        if input.is_empty() {
            println!("Digite um {} válido:", name);
            continue;
        }

        if let Ok(num) = input.parse::<i32>() {
            return num;
        } else {
            println!("Digite um {} válido:", name);
        }
    }
}

fn main() {
    let number = get_input("número".to_string());

    println!("O antecessor de {} é {}.", number, number - 1);
    println!("O sucessor de {} é {}.", number, number + 1);
}
