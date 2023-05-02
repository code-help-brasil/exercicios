// Desenvolva uma lógica que leia os valores de A, B e C de uma equação do segundo grau e mostre o valor de Delta.

use std::io;

fn get_input (name: String) -> f32 {
    println!("Digite o {}:",  name);

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
    let a = get_input("valor de A".to_string());
    let b = get_input("valor de B".to_string());
    let c = get_input("valor de C".to_string());

    let delta = (b * b) - (4.0 * a * c);

    println!("Com A = {}, B = {} e C = {}, o Delta é {}.", a, b, c, delta);
}
