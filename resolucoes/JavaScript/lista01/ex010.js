const prompt = require('prompt-sync')();

function main() {

let largura = Number(prompt("Digite a largura da parede em metros:"))
let altura = Number(prompt("Digite a altura da parede em metros:"))

let area = largura * altura

let tinta = area / 2

console.log(`A área a ser pintada é de ${area} metros quadrados.`)
console.log(`A quantidade de tinta necessária é de ${tinta} litros.`)
}

module.exports = {
    main
}