const prompt = require('prompt-sync')();

function main() {
    const num1 = Number(prompt("Digite o primeiro valor inteiro:"))
    const num2 = Number(prompt("Digite o segundo valor inteiro:"))
    const res = num1 + num2
    prompt(`A soma entre ${num1} e ${num2} é ${res}`)
}

module.exports = {
    main
}