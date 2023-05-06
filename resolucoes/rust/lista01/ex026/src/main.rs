// Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando na tela uma das mensagens abaixo:
// O primeiro valor é o maior
// O segundo valor é o maior
// Não existe valor maior, os dois são iguais

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

fn get_int (name: String) -> i32 {
    println!("Digite o {}:",  name);
    
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
    let n1 = get_int("primeiro número".to_string());
    let n2 = get_int("segundo número".to_string());

    if n1 > n2 {
        println!("O primeiro número é maior que o segundo.")
    } else if n1 < n2 {
        println!("O segundo número é maior que o segundo.")
    } else {
        println!("Os números são iguais.")
    }
}
