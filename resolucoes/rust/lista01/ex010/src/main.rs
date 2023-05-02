// Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma área de 2metros quadrados.

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
    let width = get_input("largura em metros".to_string());
    let height = get_input("altura em metros".to_string());

    let area = width * height;
    
    println!("Em uma parede com largura de {}m e altura de {}m, possui área de {}m², utilizando {} litros de tinta para pintar.", width, height, area, area / 2.0);
}
