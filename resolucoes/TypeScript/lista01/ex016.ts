import prompt from "prompt-sync"

export function main() {
    const p = prompt()
    const cigarros = Number(p("Quantos cigarros por dia você fuma?"))
    const anos = Number(p("A quantos anos você fuma?"))
    
    const perdido = 10
    const diaPorAno = 365
    
    const totalCigarros = cigarros * anos * diaPorAno
    const totalMinutos = totalCigarros * perdido
    const totalDiasPerdidos = totalMinutos / (24 * 60)
    
    console.log(`A quantidade de dias perdido é ${totalDiasPerdidos.toFixed(2)}`)
}