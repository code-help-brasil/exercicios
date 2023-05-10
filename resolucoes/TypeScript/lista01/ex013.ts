import prompt from "prompt-sync"

export function main() {
    const p = prompt()
    const salario = Number(p("Digite seu salario:"))

    const pos = salario * 0.15

    const aumento = salario + pos

    console.log(`Seu salario é ${salario} e seu aumento será de ${aumento}`)
}