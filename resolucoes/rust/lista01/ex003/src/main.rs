// Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.

use std::io;

fn get_input (name: String) -> String {
    println!("Digite o {}:",  name);

    loop {
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Failed to read line");
      
        let input = input.trim();
      
        if input.is_empty() {
          println!("Digite um {} válido:", name);
          continue;
        }
      
        return input.to_string();
    }
}

fn main() {
    let name = get_input("nome do funcionário".to_string());
    let salary = get_input("salário".to_string());

    println!("O funcionário {} tem um salário de R${} em Junho.", name, salary);
}
