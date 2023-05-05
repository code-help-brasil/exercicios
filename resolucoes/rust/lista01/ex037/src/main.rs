// Uma empresa precisa reajustar o salário dos seus funcionários, dando um aumento de acordo com alguns fatores. Faça um programa que leia o salário atual, o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa. No final, mostre o seu novo salário, baseado na tabela a seguir:
// Mulheres
// menos de 15 anos de empresa: +5%
// de 15 até 20 anos de empresa: +12%
// mais de 20 anos de empresa: +23%
// Homens
// menos de 20 anos de empresa: +3%
// de 20 até 30 anos de empresa: +13%
// mais de 30 anos de empresa: +25%

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

fn get_string(name: &str, allowed_values: Option<Vec<String>>) -> String {
    println!("Digite {}:",  name);
    
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

fn get_float(name: &str) -> f32 {
    println!("Digite {}:",  name);
    
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
    let gender = get_string("o gênero do funcionário entre homem ou mulher", Some(vec!["homem".to_string(), "mulher".to_string()]));
    let salary = get_float("o salário do funcionário");
    let years = get_int("a quantos anos o funcionário está na empresa");

    let to_increase = if gender.as_str() == "mulher" {
        if years < 15 {
            5.0
        } else if years <= 20 {
            12.0
        } else {
            23.0
        }
    } else {
        if years < 20 {
            3.0
        } else if years <= 30 {
            13.0
        } else {
            25.0
        }
    };

    println!("Seu salário aumentou para R${}.", salary + (salary * (to_increase / 100.0)));
}
