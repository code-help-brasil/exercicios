import prompt from "prompt-sync"

export function main() {
    const p = prompt()
    let nascimento = Number(p("Qual ano você nasceu?"))
    let ano = new Date().getFullYear()
    let idade = ano - nascimento
    
    if (idade >= 16) {
        console.log("Você pode votar.")
    } else {
        console.log("Você não pode votar.")
    }
}