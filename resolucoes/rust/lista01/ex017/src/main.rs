// Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

use std::io;

fn get_input (name: String) -> f32 {
    println!("Digite a {}:",  name);

    loop {
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Failed to read line");
      
        let input = input.trim();
      
        if input.is_empty() {
            println!("Digite um número válido:");
            continue;
        }

        if let Ok(num) = input.parse::<f32>() {
            return num;
        } else {
            println!("Digite um número válido:");
        }
    }
}

fn main() {
    let kmph = get_input("velocidade em km/h".to_string());

    if kmph > 80.0 {
        println!("Está acima do limite de velocidade, foi emitida uma multa no valor de R${}.", (kmph - 80.0) * 5.0);
    }

    println!("Está dentro do limite de velocidade.");
}
