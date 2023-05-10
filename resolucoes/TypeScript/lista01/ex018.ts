import prompt from "prompt-sync"

export function main() {
    const p = prompt()
    const nascimento = Number(p("Qual ano você nasceu?"))
    const ano = new Date().getFullYear()
    const idade = ano - nascimento
    
    if (idade >= 16) {
        console.log("Você pode votar.")
    } else {
        console.log("Você não pode votar.")
    }
}