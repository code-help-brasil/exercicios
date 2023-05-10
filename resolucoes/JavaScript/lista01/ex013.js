const prompt = require('prompt-sync')();

function main() {

const salario = Number(prompt("Digite seu salario:"))

const pos = salario * 0.15

const aumento = salario + pos

console.log(`Seu salario é ${salario} e seu aumento será de ${aumento}`)
}

module.exports = {
    main
}