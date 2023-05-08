import prompt from "prompt-sync"

export function main() {
    const p = prompt()

let nota1 = Number(p("Qual foi sua primeira nota?"))
let nota2 = Number(p("Qual foi sua segunda nota?"))
let media = (nota1 + nota2) / 2
p(`A média entre ${nota1} e ${nota2} é ${media}`)
}