// Crie um aplicativo que mostre na tela a seguinte contagem:
// 0 3 6 9 12 15 18 Acabou!

fn main() {
    for n in 0..=18 {
        if n % 3 == 0 {
            println!("{n}");
        }
    };

    println!("Acabou!")
}
