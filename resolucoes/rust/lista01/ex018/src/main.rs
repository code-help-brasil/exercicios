// Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou não votar.

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

    println!("Ele tem {} anos de idade e {}pode votar.", age, if age >= 18 { "" } else { "não " });
}
