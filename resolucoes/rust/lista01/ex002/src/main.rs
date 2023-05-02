// Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas para ela.

use std::io;

fn main() {
  println!("Qual seu nome?");

  loop {
    let mut name = String::new();
    io::stdin().read_line(&mut name).expect("Failed to read line");
  
    let name = name.trim();
  
    if name.is_empty() {
      println!("Digite um nome válido");
      continue;
    }
  
    println!("Olá, {}! Seja bem vindo!", name);
    break;
  }
}
