# Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até 200Km e R$0.45 para viagens mais longas.

distancia = float(input('Digite a distância da viagem em km: '))

if distancia <= 200:
    valor = distancia * 0.5
    print(f'Sua corrida custará R${valor}')
else:
    valor = distancia * 0.45
    print(f'Sua corrida custará R${valor}')
