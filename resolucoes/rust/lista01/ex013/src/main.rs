// Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.

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
    let salary = get_input("salário do funcionário".to_string());

    let percentage_salary = salary * 0.15;

    println!("O novo salário com 15% de aumento é de R${}.", salary + percentage_salary);
}
