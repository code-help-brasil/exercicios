// Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua média e mostre na tela. No final, analise a média e mostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0).

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
    let grade_1 = get_input("nota 1".to_string());
    let grade_2 = get_input("nota 2".to_string());

    let average = (grade_1 + grade_2) / 2.0;

    println!("Sua média foi de {} e {}teve um bom aproveitamento.", average, if average >= 7.0 { "" } else { "não " })
}
