// Desenvolva um programa que leia o nome de um funcionário, seu salário, quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de acordo com a tabela a seguir:
// Até 3 anos de empresa: aumento de 3%
// entre 3 e 10 anos: aumento de 12.5%
// 10 anos ou mais: aumento de 20%

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
    let name = get_string("o nome do funcionário", None);
    let salary = get_float("o salário do funcionário");
    let years = get_int("quantos anos ele trabalha na empresa");

    let increase = if years <= 3 {
        3.0
    } else if years <= 7 {
        12.5
    } else {
        20.0
    };

    println!("O salário do funcipnário {} aumentou de R${} para R${}.", name, salary, salary + (salary * (increase / 100.0)));
}
