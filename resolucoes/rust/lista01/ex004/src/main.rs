// Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.

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
            println!("Digite um {} válido:", name)
        }
    }
}

fn main() {
    let value = get_input("valor".to_string());
    let another_value = get_input("outro valor".to_string());

    println!("A soma entre {} e {} é igual a {}.", value, another_value, value + another_value);
}
