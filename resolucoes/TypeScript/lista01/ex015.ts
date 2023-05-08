import prompt from "prompt-sync"

export function main() {
    const p = prompt()

let dias = Number(p("Quantos dias trabalhados?"))

let horas = 8
let ganha = 25

let total = (horas * ganha) * dias
console.log(`Seu salario é ${total}`)

}