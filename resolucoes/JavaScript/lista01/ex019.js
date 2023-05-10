const prompt = require('prompt-sync')();

function main() {

const nome = prompt("Qual seu nome?")
const nota1 = Number(prompt("Qual foi sua primeira nota?"))
const nota2 = Number(prompt("Qual foi sua segunda nota?"))

const media = (nota1 * nota2) / 2

if (media >= 7.0) {
    console.log(`${nome} teve média de ${media.toFixed(1)} e teve um bom aproveitamento.`)
} else {
    console.log(`${nome} teve média de ${media.toFixed(1)} e precisa melhor seu desempenho.`)
}
}

module.exports = {
    main
}