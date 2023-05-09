print("Digite uma distancia em metros: ")
metros = tonumber(io.read()) -- Lê a distância em metros digitada pelo usuário e converte para um número

quilometros = metros / 1000 -- Calcula a distância em quilômetros
hectometros = metros / 100 -- Calcula a distância em hectômetros
decametros = metros / 10 -- Calcula a distância em decâmetros
decimetros = metros * 10 -- Calcula a distância em decímetros
centimetros = metros * 100 -- Calcula a distância em centímetros
milimetros = metros * 1000 -- Calcula a distância em milímetros

-- Mostra a conversão na tela

print("A distancia de " .. metros .. "m corresponde a:")
print(quilometros .. "Km")
print(hectometros .. "Hm")
print(decametros .. "Dam")
print(decimetros .. "dm")
print(centimetros .. "cm")
print(milimetros .. "mm")
