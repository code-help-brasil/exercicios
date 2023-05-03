// [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta. Analise seus comprimentos e diga se é possível formar um triângulo com essas retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.

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
    let line1 = get_float("tamanho da linha 1".to_string());
    let line2 = get_float("tamanho da linha 2".to_string());
    let line3 = get_float("tamanho da linha 3".to_string());

    println!("Com estes tamanhos de linha, {}é possível formar um triângulo.", if line1 < line2 + line3 && line2 < line1 + line3 && line3 < line1 + line2 { "" } else { "não " })
}
