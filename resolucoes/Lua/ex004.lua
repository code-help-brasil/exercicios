print("Digite um valor")
n1 = io.read() -- Lê o primeiro valor e converte para um número

print("Digite outro valor")
n2 = io.read() -- Lê o segundo valor e converte para um número

-- Mostra o resultado na tela
print("A soma entre os valores e " .. n1 + n2)

--[[
    
Esse exrcício pode ser resolvido de outra forma também:
print("Digite um valor:")
valor1 = tonumber(io.read()) -- Lê o primeiro valor e converte para um número

print("Digite outro valor:")
valor2 = tonumber(io.read()) -- Lê o segundo valor e converte para um número

soma = valor1 + valor2 -- Calcula a soma dos dois valores

-- Mostra o resultado na tela
print("A soma entre " .. valor1 .. " e " .. valor2 .. " é igual a " .. soma .. ".")

]]--