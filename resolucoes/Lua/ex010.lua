print("Digite a largura da parede em metros:")
largura = tonumber(io.read()) -- Lê a largura da parede e converte para um número

print("Digite a altura da parede em metros:")
altura = tonumber(io.read()) -- Lê a altura da parede e converte para um número

area = largura * altura -- Calcula a área da parede a ser pintada

tinta = area / 2 -- Calcula a quantidade de tinta necessária, sabendo que cada litro de tinta pinta 2 metros quadrados

-- Mostra o resultado na tela
print("A area a ser pintada e de " .. area .. " metros quadrados.")
print("Serao necessarios " .. tinta .. " litros de tinta.")
