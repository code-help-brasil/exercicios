import prompt from "prompt-sync"

export function main() {
    const p = prompt()

    const num1 = Number(p("Digite o primeiro valor inteiro:"))
    const num2 = Number(p("Digite o segundo valor inteiro:"))
    const res = num1 + num2
    p(`A soma entre ${num1} e ${num2} é ${res}`)
}