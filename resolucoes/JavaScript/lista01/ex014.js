const prompt = require('prompt-sync')();

function main() {

let kmperc = Number(prompt("Digite o KM percorrido:"))
let alugado = Number(prompt("Digite os dias alugados:"))

let precoPorDia = 90
let precoPorKm = 0.20

let total = (precoPorDia * alugado) + (precoPorKm * kmperc)

console.log(`O valor total a ser pago é ${total}`)
}

module.exports = {
    main
}