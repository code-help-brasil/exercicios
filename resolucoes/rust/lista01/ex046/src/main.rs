// Crie um programa que calcule e mostre na tela o resultado da soma entre um intervalo: ex
// 6 + 8 + 10 + 12 + 14 + ... + 98 + 100

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

fn get_int(name: &str) -> u32 {
    println!("Digite {}:",  name);
    
    loop {
        let input = get_input();

        if let Ok(num) = input.parse::<u32>() {
            return num;
        } else {
            println!("Digite um número válido:");
        }
    }
}

fn main() {
    loop {
        let initial_value = get_int("o número inicial");
        let final_value = get_int("o número final");
    
        if initial_value >= final_value {
            println!("O número inicial deve ser menor que o final.");
            continue
        };

        let increment_value = get_int("o incremento");

        let mut actual_value = initial_value;
        let mut summed_value = 0;

        while actual_value <= final_value {
            print!("{} ", actual_value);
            summed_value += actual_value;
            actual_value += increment_value;
        };
    
        println!("Os valores somados resultaram em: {}.", summed_value);
        break
    }
}
