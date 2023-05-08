import prompt from "prompt-sync"

export function main() {
    const p = prompt()

let real = Number(p("Digite um número real:"))
let dobro = real * 2
let terca = real / 3
p(`Seu número real é ${real} o dobro é ${dobro} e a terça é ${terca}`)
}