print("Digite um numero inteiro: ")
numero = tonumber(io.read()) -- Lê o número digitado pelo usuário e converte para um número

antecessor = numero - 1 -- Calcula o antecessor do número digitado
sucessor = numero + 1 -- Calcula o sucessor do número digitado

print("O antecessor de " .. numero .. " e " .. antecessor) -- Mostra o antecessor na tela
print("O sucessor de " .. numero .. " e " .. sucessor) -- Mostra o antecessor na tela