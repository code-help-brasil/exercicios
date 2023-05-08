# Execução de Exercícios com Node.js
Este é um código escrito em TypeScript que permite a execução de exercícios por meio do Node.js. O código usa o npm para instalação de dependências e a biblioteca fs para leitura de arquivos no diretório local.

## Instalação
Antes de executar o código, é necessário ter o Node.js e o npm instalados em seu computador. Para instalar as dependências necessárias, execute o seguinte comando no terminal:

```bash
npm install
```

## Execução
Para executar o código, basta executar o comando:

```bash
npm run dev
```

Ao ser executado, o código irá pedir que você digite o número do exercício desejado. Basta digitar o número correspondente e pressionar Enter.

O código irá procurar por um arquivo no diretório local cujo nome comece com "ex" seguido do número do exercício digitado. Caso encontre o arquivo, o código irá importar a função main contida nele e executá-la. Caso contrário, uma mensagem de erro será exibida no console.

Ao final da execução, uma mensagem de "OK" será exibida no console, indicando que o exercício foi executado com sucesso. Em caso de erros durante a execução, uma mensagem de erro será exibida no console.
