// Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.

use std::io;
use chrono::prelude::*;

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
    let year = get_input("ano".to_string());

    println!("O ano {}é bissexto.", if NaiveDate::from_ymd_opt(year, 2, 29).is_some() { "" } else { "não " });
}
