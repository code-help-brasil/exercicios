// Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
// Quantos homens foram cadastrados
// Quantas mulheres foram cadastradas
// A média de idade do grupo
// A média de idade dos homens
// Quantas mulheres tem mais de 20 anos

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

fn get_string(name: &str, allowed_values: Option<Vec<String>>) -> String {
    println!("Digite {}:",  name);
    
    loop {
        let input = get_input();

        if let Some(values) = allowed_values.as_ref() {
            if !values.contains(&input) {
                println!("Entrada inválida. Os valores permitidos são: {:?}", values);
                continue;
            }
        }
        
        return input;
    }
}

fn get_int(name: &str) -> i32 {
    println!("Digite {}:",  name);
    
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
    let mut men = 0;
    let mut women = 0;
    let mut summed_ages = 0;
    let mut men_summed_ages = 0;
    let mut greather_age_than_20 = 0;

    for n in 1..=5 {
        let gender_options = vec!["H".to_string(), "M".to_string()];
        let gender = get_string(format!("o genero da {}º pessoa entre: {:?}", n, gender_options).as_str(), Some(gender_options));
        let age = get_int(format!("a idade da {}º pessoa", n).as_str());

        if gender == "H" {
            men += 1;
            summed_ages += age;
            men_summed_ages += age;
        } else {
            women += 1;
            summed_ages += age;
        };

        if age > 20 {
            greather_age_than_20 += 1;
        };
    };

    println!("{} são homens.", men);
    println!("{} são mulherer.", women);
    println!("A média de idade é de {}.", summed_ages / 5);
    println!("A média de idade dos homens é de {}.", men_summed_ages / men);
    println!("{} tem mais de 20 anos.", greather_age_than_20);
}
