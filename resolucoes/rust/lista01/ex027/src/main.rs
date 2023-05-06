// Crie um programa que leia duas notas de um aluno e calcule a sua média, mostrando uma mensagem no final, de acordo com a média atingida:
// Média até 4.9: REPROVADO
// Média entre 5.0 e 6.9: RECUPERAÇÃO
// Média 7.0 ou superior: APROVADO

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
    println!("Digite a {}:",  name);
    
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
    let note1 = get_float("primeira nota".to_string());
    let note2 = get_float("segunda nota".to_string());

    let average = (note1 + note2) / 2.0;

    if average < 5.0 {
        println!("REPROVADO");
    } else if average < 7.0 {
        println!("RECUPERAÇÃO");
    } else {
        println!("APROVADO");
    }
}
