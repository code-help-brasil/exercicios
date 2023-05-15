const prompt = require('prompt-sync')();

function main() {
    const int = Number(prompt("Digite um número inteiro:"))
    const ant = int - 1
    const suc = int + 1
    prompt(`Seu número inteiro é ${int} o antecessor é ${ant} e seu sucessor é ${suc}`)
}

module.exports = {
    main
}