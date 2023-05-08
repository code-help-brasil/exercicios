import prompt from "prompt-sync"

export function main() {
    const p = prompt()
    let velocidade = Number(p("Qual a velocidade do carro?"))
    let cobrado = 5
    
    if (velocidade > 80) {
        // Velocidade maior que 80KM
        console.log("Velocidade superior a 80KM você será multado!")
        let total = (velocidade - 80) * 5
        console.log(`Sua velocidade foi de ${velocidade}, você será multado em R$:${total} `)
    } else {
        console.log("Velocidade inferior ou igual a 80KM, tudo ok!")
    }
}