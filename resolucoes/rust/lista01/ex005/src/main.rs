// Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.

use std::io;

fn get_input (name: String) -> f32 {
    println!("Digite a {}:",  name);

    loop {
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Failed to read line");
      
        let input = input.trim();
      
        if input.is_empty() {
            println!("Digite uma {} válida:", name);
            continue;
        }

        if let Ok(num) = input.parse::<f32>() {
            return num;
        } else {
            println!("Digite uma {} válida:", name);
        }
    }
}

fn main() {
    let grade_1 = get_input("nota 1".to_string());
    let grade_2 = get_input("nota 2".to_string());

    println!("A média entre {} e {} é igual a {}.", grade_1, grade_2, (grade_1 + grade_2) / 2.0);
}
