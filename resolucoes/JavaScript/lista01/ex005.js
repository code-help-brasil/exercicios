const prompt = require('prompt-sync')();

function main() {
    const nota1 = Number(prompt("Qual foi sua primeira nota?"))
    const nota2 = Number(prompt("Qual foi sua segunda nota?"))
    const media = (nota1 + nota2) / 2
    prompt(`A soma entre ${nota1} e ${nota2} é ${media}`)
}

module.exports = {
    main
}