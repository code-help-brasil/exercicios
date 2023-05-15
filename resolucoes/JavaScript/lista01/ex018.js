const prompt = require('prompt-sync')();

function main() {

const nascimento = Number(prompt("Qual ano você nasceu?"))
const ano = new Date().getFullYear()
const idade = ano - nascimento

if (idade >= 16) {
    console.log("Você pode votar.")
} else {
    console.log("Você não pode votar.")
}
}

module.exports = {
    main
}