-- Lê o nome do funcionário
print("Qual e seu nome?")
nome = io.read()

-- Lê o salário do funcionário
print("Qual seu salario?")
salario = io.read()

-- Mostra a mensagem na tela
print("O funcionario " .. nome .. " tem um salario de " .. salario .. " em julho")