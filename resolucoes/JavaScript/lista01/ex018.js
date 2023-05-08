const prompt = require('prompt-sync')();

function main() {

let nascimento = Number(prompt("Qual ano você nasceu?"))
let ano = new Date().getFullYear()
let idade = ano - nascimento

if (idade >= 16) {
    console.log("Você pode votar.")
} else {
    console.log("Você não pode votar.")
}
}

module.exports = {
    main
}