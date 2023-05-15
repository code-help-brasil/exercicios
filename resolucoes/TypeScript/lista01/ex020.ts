import prompt from "prompt-sync"

export function main() {
    const p = prompt()
    const numero = Number(p("Digite um número inteiro:"))

    if (numero % 2 == 0) {
        console.log("O número é PAR.")
    } else {
        console.log("O número é ÍMPAR.")
    }
}