import prompt from "prompt-sync"

export function main() {
    const p = prompt()
    let a = Number(p("Digite o valor de A:"))
    let b = Number(p("Digite o valor de B:"))
    let c = Number(p("Digite o valor de C:"))
    
    let delta = (b * b) - (4 * a * c)
    
    console.log(`O valor de Delta é: ${delta}`)
}