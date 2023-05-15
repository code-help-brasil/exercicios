// Desenvolva um aplicativo que mostre na tela o resultado da expressão
// 500 + 450 + 400 + 350 + 300 + ... + 50 + 0

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
    loop {
        let initial_value = get_int("o número inicial");
        let final_value = get_int("o número final");

        if initial_value <= final_value {
            println!("O número inicial deve ser maior que o final.");
            continue
        };

        let decrement_value = get_int("o decremento");

        let mut actual_value = initial_value;
        let mut summed_value = 0;

        while actual_value >= final_value {
            print!("{} ", actual_value);
            summed_value += actual_value;
            actual_value -= decrement_value;
        };
    
        println!("Os valores somados resultaram em: {}.", summed_value);
        break
    }
}
