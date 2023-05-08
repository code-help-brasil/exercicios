const prompt = require('prompt-sync')();

function main() {

let preco = Number(prompt("Digite o valor do produto:"))

let desconto = preco * 0.05

let promocao = preco - desconto

console.log(`O valor do seu podre é: ${preco} e seu desconto de 5% é ${promocao}`)
}

module.exports = {
    main
}