// Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.

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
    let number = get_input("número".to_string());

    println!("O dobro de {} é {}.", number, number * 2.0);
    println!("A terça parte de {} é {}.", number, number / 3.0);
}
