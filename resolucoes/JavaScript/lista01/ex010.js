const prompt = require('prompt-sync')();

function main() {

const largura = Number(prompt("Digite a largura da parede em metros:"))
const altura = Number(prompt("Digite a altura da parede em metros:"))

const area = largura * altura

const tinta = area / 2

console.log(`A área a ser pintada é de ${area} metros quadrados.`)
console.log(`A quantidade de tinta necessária é de ${tinta} litros.`)
}

module.exports = {
    main
}