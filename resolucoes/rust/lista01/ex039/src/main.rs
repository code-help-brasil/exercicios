// Faça um algoritmo que mostre na tela a seguinte contagem:
// 10 9 8 7 6 5 4 3 Acabou!

fn main() {
    for n in (3..=10).rev() {
        println!("{n}");
    };

    println!("Acabou!")
}
