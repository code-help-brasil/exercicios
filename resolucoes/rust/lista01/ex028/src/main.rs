// Faça um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua área em m². O programa também deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
// Abaixo de 100m² = TERRENO POPULAR
// Entre 100m² e 500m² = TERRENO MASTER
// Acima de 500m² = TERRENO VIP

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
    let width = get_float("a largura".to_string());
    let length = get_float("o comprimento".to_string());

    let area = width * length;

    if area <= 100.0 {
        println!("TERRENO POPULAR");
    } else if area <= 200.0 {
        println!("TERRENO MASTER");
    } else {
        println!("TERRENO VIP");
    }
}
