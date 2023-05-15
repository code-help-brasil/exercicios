// Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela qual foi o maior e qual foi o menor preço digitados.

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
    let mut greather: f32 = 0.0;
    let mut smaller: f32 = 0.0;

    for n in 1..=8 {
        let number = get_float(format!("o preço {}º produto", n).as_str());

        if number > greather {
            greather = number;
        };

        if number < smaller || smaller == 0.0 {
            smaller = number;
        };
    };

    println!("O maior preço foi de R${} e o menor foi de R${}.", greather, smaller);
}
