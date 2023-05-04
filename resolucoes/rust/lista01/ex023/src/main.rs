// Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres. Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo que:
// Homens ganham 5% de desconto
// Mulheres ganham 13% de desconto

use std::io;

fn get_input () -> String {
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

fn get_string (name: String, allowed_values: Option<Vec<String>>) -> String {
    println!("Digite o {}:",  name);
    
    loop {
        let input = get_input();

        if let Some(values) = allowed_values.as_ref() {
            if !values.contains(&input) {
                println!("Entrada inválida. Os valores permitidos são: {:?}", values);
                continue;
            }
        }
        
        return input;
    }
}

fn get_float (name: String) -> f32 {
    println!("Digite o {}:",  name);
    
    loop {
        let input = get_input();

        if let Ok(num) = input.parse::<f32>() {
            return num;
        } else {
            println!("Digite um número válido:");
        }
    }
}

fn main() {
    let name = get_string("nome".to_string(), None);
    let gender = get_string("gênero (H/M)".to_string(), Some(vec!["H".to_string(), "M".to_string()]));
    let value = get_float("valor do produto".to_string());

    let discount: f32 = if gender == "H" {
        5.0
    } else {
        13.0
    };

    println!("O produto d{} cliente {}, com valor de R${}, com o desconto de {}%, ficou R${}.", if gender == "H" { "o" } else { "a" }, name, value, discount, value - (value / 100.0 * discount));
}
