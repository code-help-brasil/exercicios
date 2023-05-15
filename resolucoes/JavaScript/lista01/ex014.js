const prompt = require('prompt-sync')();

function main() {

const kmperc = Number(prompt("Digite o KM percorrido:"))
const alugado = Number(prompt("Digite os dias alugados:"))

const precoPorDia = 90
const precoPorKm = 0.20

const total = (precoPorDia * alugado) + (precoPorKm * kmperc)

console.log(`O valor total a ser pago é ${total}`)
}

module.exports = {
    main
}