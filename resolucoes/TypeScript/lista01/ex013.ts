import prompt from "prompt-sync"

export function main() {
    const p = prompt()
    let salario = Number(p("Digite seu salario:"))

    let pos = salario * 0.15

    let aumento = salario + pos

    console.log(`Seu salario é ${salario} e seu aumento será de ${aumento}`)
}