const prompt = require('prompt-sync')();

function main() {
    const real = Number(prompt("Digite um número real:"))
    const dobro = real * 2
    const terca = real / 3
    prompt(`Seu número real é ${real} o dobro é ${dobro} e a terça é ${terca}`)
}

module.exports = {
    main
}