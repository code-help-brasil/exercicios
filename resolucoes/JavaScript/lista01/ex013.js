const prompt = require('prompt-sync')();

function main() {

let salario = Number(prompt("Digite seu salario:"))

let pos = salario * 0.15

let aumento = salario + pos

console.log(`Seu salario é ${salario} e seu aumento será de ${aumento}`)
}

module.exports = {
    main
}