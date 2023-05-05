// [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)

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

fn convert(n: &i32) -> &'static str {
    match n {
        1 => "pedra",
        2 => "papel",
        3 => "tesoura",
        _ => "Valor inválido"
    }
}

fn main() {    
    loop {
        println!("Jogo de pedra papel ou tesoura");

        let avaible_choices = vec![1, 2, 3];
        let choice = get_int("sua escolha entre: 1 = pedra, 2 = papel, 3 = tesoura", Some(avaible_choices), false);
    
        let mut rng = rand::thread_rng();
        let opponent_choice = rng.gen_range(1..=3);
    
        println!("Você escolheu {}.", convert(&choice));
        println!("O oponente escolheu {}.", convert(&opponent_choice));
    
        let winner = match (choice, opponent_choice) {
            (1, 3) | (2, 1) | (3, 2) => "Você venceu",
            (1, 2) | (2, 3) | (3, 1) => "Oponente venceu",
            _ => "Empate",
        };
    
        println!("{}.", winner);

        let again = get_string("'S' se quiser jogar novamente", None, true);

        if again != "S".to_string() {
            break
        }

        let _ = Command::new("clear").status();
    }

}
