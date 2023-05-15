import prompt from "prompt-sync"

export function main() {
    const p = prompt()

const real = Number(p("Digite um número real:"))
const dobro = real * 2
const terca = real / 3
p(`Seu número real é ${real} o dobro é ${dobro} e a terça é ${terca}`)
}