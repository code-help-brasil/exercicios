// Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e mostre na tela:
// Quais foram os números sorteados
// Quantos números estão acima de 5
// Quantos números são divisíveis por 3

use rand::Rng;

fn main() {
    let mut numbers: Vec<i32> = vec![];
    let mut greater_than_5 = 0;
    let mut is_divisible_by_3 = 0;

    let mut rng = rand::thread_rng();

    for _ in 0..10 {
        let number = rng.gen_range(0..=10);

        numbers.push(number);

        if number > 5 {
            greater_than_5 += 1;
        }

        if number % 3 == 0 && number != 0 {
            is_divisible_by_3 += 1;
        }
    }

    println!("Os números sorteados foram {:?}.", numbers);
    println!("{} são maiores que 5.", greater_than_5);
    println!("{} são divisiveis por 3.", is_divisible_by_3);
}
