import prompt from "prompt-sync"

export function main() {
    const p = prompt()

    const dias = Number(p("Quantos dias trabalhados?"))

    const horas = 8
    const ganha = 25

    const total = (horas * ganha) * dias
    console.log(`Seu salario é ${total}`)

}