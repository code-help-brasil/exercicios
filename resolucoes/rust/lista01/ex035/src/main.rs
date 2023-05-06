// Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a tabela a seguir:
// Carros populares (aluguel de R$90 por dia)
// Até 100Km percorridos: R$0,20 por Km
// Acima de 100Km percorridos: R$0,10 por Km
// Carros de luxo (aluguel de R$150 por dia)
// Até 200Km percorridos: R$0,30 por Km
// Acima de 200Km percorridos: R$0,25 por Km

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
    let car = get_string("o tipo do carro entre popular e luxo", Some(vec!["popular".to_string(), "luxo".to_string()]));
    let km = get_float("os km rodados");

    let car_cost = match car.as_str() {
        "popular" => 90.0,
        "luxo" => 150.0,
        _ => 0.0,
    };

    let km_cost = match car.as_str() {
        "popular" => if km > 100.0 { 0.1 } else { 0.2 },
        "luxo" => if km > 200.0 { 0.25 } else { 0.3 },
        _ => 0.0,
    };

    println!("{} {}", car_cost, km_cost);
}
