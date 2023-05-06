// [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o jogador vai tentar descobrir qual foi o valor sorteado.

use std::io;
use rand::Rng;
use std::process::Command;

fn get_input(allow_empty: bool) -> String {
    loop {
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Failed to read line");

        let input = input.trim().to_string();
      
        if input.is_empty() && !allow_empty {
            println!("Digite um valor válido:");
            continue;
        }

        return input
    }
}


fn get_string(name: &str, allowed_values: Option<Vec<String>>, allow_empty: bool) -> String {
    println!("Digite {}:",  name);
    
    loop {
        let input = get_input(allow_empty || false);

        if let Some(values) = allowed_values.as_ref() {
            if !values.contains(&input) {
                println!("Entrada inválida. Os valores permitidos são: {:?}", values);
                continue;
            }
        }
        
        return input;
    }
}


fn get_int(name: &str, allowed_values: Option<Vec<i32>>, allow_empty: bool) -> i32 {
    println!("Digite {}:",  name);
    
    loop {
        let input = get_input(allow_empty || false);

        if let Ok(num) = input.parse::<i32>() {
            if let Some(values) = allowed_values.as_ref() {
                if !values.contains(&num) {
                    println!("Entrada inválida. Os valores permitidos são: {:?}", values);
                    continue;
                }
            }

            return num;
        } else {
            println!("Digite um número válido:");
        }
    }
}

fn main() {
    loop {
        println!("Jogo de acertar o número");

        let allowed_range = 1..=5;
        let allowed_values: Vec<i32> = allowed_range.clone().collect();
        let choice = get_int("a sua escolha entre 1 e 5", Some(allowed_values), false);
    
        let mut rng = rand::thread_rng();
        let random_number = rng.gen_range(allowed_range);
    
        if choice == random_number {
            println!("Você venceu.");
        } else {
            println!("Você errou, o número era {}.", random_number)
        }
        
        let again = get_string("'S' se quiser jogar novamente", None, true);
    
        if again != "S".to_string() {
            break
        }
    
        let _ = Command::new("clear").status();
    }
}
