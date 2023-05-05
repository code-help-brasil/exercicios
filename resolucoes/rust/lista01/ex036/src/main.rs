// Um programa de vida saudável quer dar pontos atividades físicas que podem ser trocados por dinheiro. O sistema funciona assim:
// Cada hora de atividade física no mês vale pontos
// até 10h de atividade no mês: ganha 2 pontos por hora
// de 10h até 20h de atividade no mês: ganha 5 pontos por hora
// acima de 20h de atividade no mês: ganha 10 pontos por hora
// A cada ponto ganho, o cliente fatura R$0,05 (5 centavos) Faça um programa que leia quantas horas de atividade uma pessoa teve por mês, calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.

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
    let activity = get_float("por quantas horas fez atividade física");

    let hour_value = if activity <= 10.0 {
        2.0
    } else if activity <= 20.0 {
        5.0
    } else {
        10.0
    };

    let points = activity * hour_value;

    println!("Você obteve {} pontos este mes e faturou R${}.", points, points * 0.05);
}
