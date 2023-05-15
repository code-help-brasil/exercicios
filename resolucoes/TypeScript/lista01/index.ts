import prompt from 'prompt-sync'
import fs from 'fs'

const main = async () => {
  const p = prompt()
  const ex = p("Digite o número do exercicio:")

  const files = fs.readdirSync('./')
  const file = files.find((f) => f.startsWith(`ex${ex}`))

  if (file) {
    const { main } = await import(`./${file}`)
    try {
        await main()
    } catch (error) {}
    console.log('OK')
  } else {
    console.log("Exercício ex${ex} não encontrado.")
  }
}

main()