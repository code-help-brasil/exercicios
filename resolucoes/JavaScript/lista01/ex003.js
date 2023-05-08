const prompt = require('prompt-sync')();

function main() {
    const nome = prompt("Qual é o seu nome?")
    const salario = prompt("Qual seu salario?")
    prompt(`O funcionário ${nome} tem um salário de ${salario} em Junho.`)
}

module.exports = {
    main
}