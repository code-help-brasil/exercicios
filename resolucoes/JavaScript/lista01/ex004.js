const prompt = require('prompt-sync')();

function main() {
    let num1 = Number(prompt("Digite o primeiro valor inteiro:"))
    let num2 = Number(prompt("Digite o segundo valor inteiro:"))
    let res = num1 + num2
    prompt(`A soma entre ${num1} e ${num2} é ${res}`)
}

module.exports = {
    main
}