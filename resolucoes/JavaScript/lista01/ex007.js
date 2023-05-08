const prompt = require('prompt-sync')();

function main() {
    let real = Number(prompt("Digite um número real:"))
    let dobro = real * 2
    let terca = real / 3
    prompt(`Seu número real é ${real} o dobro é ${dobro} e a terça é ${terca}`)
}

module.exports = {
    main
}