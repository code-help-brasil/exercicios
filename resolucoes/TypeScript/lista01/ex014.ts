import prompt from "prompt-sync"

export function main() {
    const p = prompt()
    const kmperc = Number(p("Digite o KM percorrido:"))
    const alugado = Number(p("Digite os dias alugados:"))

    const precoPorDia = 90
    const precoPorKm = 0.20

    const total = (precoPorDia * alugado) + (precoPorKm * kmperc)

    console.log(`O valor total a ser pago é ${total}`)
}