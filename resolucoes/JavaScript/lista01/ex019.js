const prompt = require('prompt-sync')();

function main() {

let nome = prompt("Qual seu nome?")
let nota1 = Number(prompt("Qual foi sua primeira nota?"))
let nota2 = Number(prompt("Qual foi sua segunda nota?"))

let media = (nota1 * nota2) / 2

if (media >= 7.0) {
    console.log(`${nome} teve média de ${media.toFixed(1)} e teve um bom aproveitamento.`)
} else {
    console.log(`${nome} teve média de ${media.toFixed(1)} e precisa melhor seu desempenho.`)
}
}

module.exports = {
    main
}