// [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um fumante perderá e exiba o total em dias.

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
    let cigarettes_per_day = get_input("cigarros por dia".to_string());
    let years = get_input("anos já fumou".to_string());

    let lost_minutes = (years * 365.0) * cigarettes_per_day * 10.0;

    println!("Fumando {} por dia a {} anos se perderam {} dias de vida.", cigarettes_per_day, years, lost_minutes / 1440.0);
}
