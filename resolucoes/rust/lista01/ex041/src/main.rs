// Desenvolva um programa que mostre na tela a seguinte contagem:
// 100 95 90 85 80 ... 0 Acabou!

fn main() {
    for n in (0..=100).rev() {
        if n % 5 == 0 {
            println!("{n}");
        }
    };

    println!("Acabou!")
}
