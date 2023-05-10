import prompt from "prompt-sync"

export function main() {
    const p = prompt()

const nota1 = Number(p("Qual foi sua primeira nota?"))
const nota2 = Number(p("Qual foi sua segunda nota?"))
const media = (nota1 + nota2) / 2
p(`A média entre ${nota1} e ${nota2} é ${media}`)
}