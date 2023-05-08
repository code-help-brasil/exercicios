import prompt from "prompt-sync"

export function main() {
    const p = prompt()
    let cigarros = Number(p("Quantos cigarros por dia você fuma?"))
    let anos = Number(p("A quantos anos você fuma?"))
    
    let perdido = 10
    let diaPorAno = 365
    
    let totalCigarros = cigarros * anos * diaPorAno
    let totalMinutos = totalCigarros * perdido
    let totalDiasPerdidos = totalMinutos / (24 * 60)
    
    console.log(`A quantidade de dias perdido é ${totalDiasPerdidos.toFixed(2)}`)
}