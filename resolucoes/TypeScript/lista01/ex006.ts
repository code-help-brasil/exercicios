import prompt from "prompt-sync"

export function main() {
    const p = prompt()

let int = Number(p("Digite um número inteiro:"))
let ant = int - 1
let suc = int + 1
p(`Seu número inteiro é ${int} o antecessor é ${ant} e seu sucessor é ${suc}`)
}