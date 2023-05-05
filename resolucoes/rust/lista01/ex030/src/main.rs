// [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo de triângulo será formado:
// EQUILÁTERO: todos os lados iguais
// ISÓSCELES: dois lados iguais
// ESCALENO: todos os lados diferentes

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

fn get_float (name: &str) -> f32 {
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
    let line1 = get_float("o tamanho da linha 1");
    let line2 = get_float("o tamanho da linha 2");
    let line3 = get_float("o tamanho da linha 3");

    if line1 < line2 + line3 && line2 < line1 + line3 && line3 < line1 + line2 {
        if line1 == line2 && line2 == line3 {
            println!("É um triângulo EQUILÁTERO");
        } else if (line1 == line2 && line1 != line3) || (line1 == line3 && line1 != line2) || (line2 == line3 && line2 != line1) {
            println!("É um triângulo ISÓSCELES");
        } else {
            println!("É um triângulo ESCALENO");
        };
    } else {
        println!("Não é um triângulo.")
    };
}
