const prompt = require('prompt-sync')();

function main() {

const a = Number(prompt("Digite o valor de A:"))
const b = Number(prompt("Digite o valor de B:"))
const c = Number(prompt("Digite o valor de C:"))

const delta = (b * b) - (4 * a * c)

console.log(`O valor de Delta é: ${delta}`)
}

module.exports = {
    main
}