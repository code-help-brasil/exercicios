// Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas.

use std::io;

fn get_input (name: String) -> f32 {
    println!("Digite uma {}:",  name);

    loop {
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Failed to read line");
      
        let input = input.trim();
      
        if input.is_empty() {
            println!("Digite uma {} válida:", name);
            continue;
        }

        if let Ok(num) = input.parse::<f32>() {
            return num;
        } else {
            println!("Digite uma {} válida:", name);
        }
    }
}

fn main() {
    let distance = get_input("distância em metros".to_string());

    println!("A distância de {}m corresponde a:", distance);
    println!("{} Km     {} dm", distance / 1000.0, distance * 10.0);
    println!("{} Hm     {} cm", distance / 100.0, distance * 100.0);
    println!("{} Dam     {} mm", distance / 10.0, distance * 1000.0);
}
