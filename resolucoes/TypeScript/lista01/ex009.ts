import prompt from "prompt-sync"

export function main() {
    const p = prompt()

    const reais = Number(p("Digite quanto você tem na carteira:"))
    
    const dolares = reais / 3.45
    
    console.log(`Com R$:${reais} você pode comprar US$:${dolares.toFixed(2)}`)
}