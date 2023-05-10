const prompt = require('prompt-sync')();

function main() {

const dias = Number(prompt("Quantos dias trabalhados?"))

const horas = 8
const ganha = 25

const total = (horas * ganha) * dias
console.log(`Seu salario é ${total}`)
}

module.exports = {
    main
}