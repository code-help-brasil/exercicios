print("Digite o valor em reais que voce tem na carteira:")
reais = tonumber(io.read()) -- Lê o valor em reais e converte para um número

dolares = reais / 3.45 -- Calcula o valor em dólares usando a taxa de câmbio

-- Mostra o resultado na tela
print("Com R$" .. reais .. ", voce pode comprar US$" .. string.format("%.2f", dolares))
