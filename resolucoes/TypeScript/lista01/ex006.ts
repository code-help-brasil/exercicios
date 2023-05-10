import prompt from "prompt-sync"

export function main() {
    const p = prompt()

const int = Number(p("Digite um número inteiro:"))
const ant = int - 1
const suc = int + 1
p(`Seu número inteiro é ${int} o antecessor é ${ant} e seu sucessor é ${suc}`)
}