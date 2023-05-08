const prompt = require('prompt-sync')();

function main() {

let cigarros = Number(prompt("Quantos cigarros por dia você fuma?"))
let anos = Number(prompt("A quantos anos você fuma?"))

let perdido = 10
let diaPorAno = 365

let totalCigarros = cigarros * anos * diaPorAno
let totalMinutos = totalCigarros * perdido
let totalDiasPerdidos = totalMinutos / (24 * 60)

console.log(`A quantidade de dias perdido é ${totalDiasPerdidos.toFixed(2)}`)
}

module.exports = {
    main
}