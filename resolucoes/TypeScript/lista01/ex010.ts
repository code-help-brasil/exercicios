import prompt from "prompt-sync"

export function main() {
    const p = prompt()
    let largura = Number(p("Digite a largura da parede em metros:"))
    let altura = Number(p("Digite a altura da parede em metros:"))
    
    let area = largura * altura
    
    let tinta = area / 2
    
    console.log(`A área a ser pintada é de ${area} metros quadrados.`)
    console.log(`A quantidade de tinta necessária é de ${tinta} litros.`)
}


