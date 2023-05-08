const prompt = require('prompt-sync')();

function main() {

let a = Number(prompt("Digite o valor de A:"))
let b = Number(prompt("Digite o valor de B:"))
let c = Number(prompt("Digite o valor de C:"))

let delta = (b * b) - (4 * a * c)

console.log(`O valor de Delta é: ${delta}`)
}

module.exports = {
    main
}