const prompt = require('prompt-sync')();

function main() {
    let nota1 = Number(prompt("Qual foi sua primeira nota?"))
    let nota2 = Number(prompt("Qual foi sua segunda nota?"))
    let media = (nota1 + nota2) / 2
    prompt(`A soma entre ${nota1} e ${nota2} é ${media}`)
}

module.exports = {
    main
}