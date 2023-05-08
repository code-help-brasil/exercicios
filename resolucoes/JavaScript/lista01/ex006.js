const prompt = require('prompt-sync')();

function main() {
    let int = Number(prompt("Digite um número inteiro:"))
    let ant = int - 1
    let suc = int + 1
    prompt(`Seu número inteiro é ${int} o antecessor é ${ant} e seu sucessor é ${suc}`)
}

module.exports = {
    main
}