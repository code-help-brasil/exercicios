const prompt = require('prompt-sync')();

function main() {

    const reais = Number(prompt("Digite quanto você tem na carteira:"))

    const dolares = reais / 3.45

    console.log(`Com R$:${reais} você pode comprar US$:${dolares.toFixed(2)}`)
}

module.exports = {
    main
}