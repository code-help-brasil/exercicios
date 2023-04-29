# A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa que pergunte a quantidade de km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por km rodado.

distancia_percorrida = float(input('Digite a distância percorrida: '))
dias_alugados = int(input('Digite a quantidade de dias que o carro foi alugado: '))

total_a_pagar = (dias_alugados * 90) + (distancia_percorrida * 0.2)

print(f'O total a pagar pelo aluguel do carro é de: R${total_a_pagar}')
