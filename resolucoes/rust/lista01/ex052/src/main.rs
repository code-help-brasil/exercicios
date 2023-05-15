// Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
// Qual é a média de idade do grupo
// Quantas pessoas tem mais de 18 anos
// Quantas pessoas tem menos de 5 anos
// Qual foi a maior idade lida

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
    let mut summed_ages = 0;
    let mut greather_than_18 = 0;
    let mut smaller_than_5 = 0;
    let mut greather_age = 0;

    for n in 1..=10 {
        let age = get_int(format!("a idade da {}º pessoa", n).as_str());

        summed_ages += age;

        if age > 18 {
            greather_than_18 += 1;
        };

        if age < 5 {
            smaller_than_5 += 1;
        };

        if age > greather_age {
            greather_age = age;
        }
    };

    println!("A média de idade é de {}.", summed_ages / 10);
    println!("{} são maiores de 18 anos.", greather_than_18);
    println!("{} tem menos de 5 anos.", smaller_than_5);
    println!("A maior idade é de {} anos.", greather_age);
}
