import prompt from "prompt-sync"
export function main() {
    const p = prompt()
    const nome = p("Qual é o seu nome?")
    console.log(`Olá ${nome}, é um prazer te conhecer!`)

}
