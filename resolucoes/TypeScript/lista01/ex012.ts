import prompt from "prompt-sync"

export function main() {
    const p = prompt()

    let preco = Number(p("Digite o valor do produto:"))

    let desconto = preco * 0.05

    let promocao = preco - desconto

    console.log(`O valor do seu podre é: ${preco} e seu desconto de 5% é ${promocao}`)
}