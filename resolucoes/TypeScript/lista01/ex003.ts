import prompt from "prompt-sync"
export function main() {
    const p = prompt()

    const nome = p("Qual é o seu nome?")
    const salario = p("Qual é seu salario?")
    console.log(`O funcionário ${nome} tem um salário de ${salario} em Junho.`)

}