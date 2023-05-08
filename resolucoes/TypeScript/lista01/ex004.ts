import prompt from "prompt-sync"

export function main() {
    const p = prompt()

    let num1 = Number(p("Digite o primeiro valor inteiro:"))
    let num2 = Number(p("Digite o segundo valor inteiro:"))
    let res = num1 + num2
    p(`A soma entre ${num1} e ${num2} é ${res}`)
}