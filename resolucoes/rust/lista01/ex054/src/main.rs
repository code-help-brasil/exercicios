// Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando no final:
// Qual foi a média de altura do grupo
// Quantas pessoas pesam mais de 90Kg
// Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
// Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.

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
    let mut summed_heights = 0.0;
    let mut greather_than_90 = 0;
    let mut smaller_than_50_and_smaller_than_160 = 0;
    let mut greather_than_190_and_greather_than_100 = 0;

    for n in 1..=7 {
        let weight = get_float(format!("o peso da {}º pessoa", n).as_str());
        let height = get_float(format!("a altura da {}º pessoa", n).as_str());

        summed_heights += height;

        if weight > 90.0 {
            greather_than_90 += 1;
        };

        if weight < 50.0 && height < 1.60 {
            smaller_than_50_and_smaller_than_160 += 1;
        };

        if height > 1.90 && weight > 100.0 {
            greather_than_190_and_greather_than_100 += 1;
        }
    };

    println!("A média de altura do grupo é de {}m.", summed_heights / 7.0);
    println!("{} pessoas pesam mais de 90Kg.", greather_than_90);
    println!("{} pessoas que pesam menos de 50Kg tem menos de 1.60m.", smaller_than_50_and_smaller_than_160);
    println!("{} pessoas que medem mais de 1.90m pesam mais de 100Kg.", greather_than_190_and_greather_than_100);
}