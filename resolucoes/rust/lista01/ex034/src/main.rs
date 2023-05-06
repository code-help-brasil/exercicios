// O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o indivíduo dentro de certas faixas.

// abaixo de 18.5: Abaixo do peso
// entre 18.5 e 25: Peso ideal
// entre 25 e 30: Sobrepeso
// entre 30 e 40: Obesidade
// acima de 40: Obseidade mórbida

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
    let weight = get_float("o peso");
    let height = get_float("a altura");

    let imc = weight / (height * height);

    if imc < 18.5 {
        println!("Abaixo do peso");
    } else if imc < 25.0 {
        println!("Peso ideal");
    } else if imc < 30.0 {
        println!("Sobrepeso");
    } else if imc < 40.0 {
        println!("Obesidade");
    } else {
        println!("Obseidade mórbida");
    }
}
