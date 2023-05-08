const prompt = require('prompt-sync')();

function main() {
    const nome = prompt("Qual é o seu nome?")
    prompt(`Olá ${nome}, é um prazer te conhecer!`)
}

module.exports = {
    main
}