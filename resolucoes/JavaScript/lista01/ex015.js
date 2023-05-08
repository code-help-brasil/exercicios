const prompt = require('prompt-sync')();

function main() {

let dias = Number(prompt("Quantos dias trabalhados?"))

let horas = 8
let ganha = 25

let total = (horas * ganha) * dias
console.log(`Seu salario é ${total}`)
}

module.exports = {
    main
}