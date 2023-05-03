print("Digite a primeira nota: ")
nota1 = tonumber(io.read()) -- Lê a primeira nota digitada pelo usuário e converte para um número

print("Digite a segunda nota: ")
nota2 = tonumber(io.read()) -- Lê a segunda nota digitada pelo usuário e converte para um número

media = (nota1 + nota2) / 2 -- Calcula a média das duas notas

print("A media entre " .. nota1 .. " e " .. nota2 .. " e igual a " .. media) -- Mostra a média na tela