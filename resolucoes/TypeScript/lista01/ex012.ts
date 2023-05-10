import prompt from "prompt-sync"

export function main() {
    const p = prompt()

    const preco = Number(p("Digite o valor do produto:"))

    const desconto = preco * 0.05

    const promocao = preco - desconto

    console.log(`O valor do seu podre é: ${preco} e seu desconto de 5% é ${promocao}`)
}