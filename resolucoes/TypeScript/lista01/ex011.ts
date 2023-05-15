import prompt from "prompt-sync"

export function main() {
    const p = prompt()
    const a = Number(p("Digite o valor de A:"))
    const b = Number(p("Digite o valor de B:"))
    const c = Number(p("Digite o valor de C:"))
    
    const delta = (b * b) - (4 * a * c)
    
    console.log(`O valor de Delta é: ${delta}`)
}