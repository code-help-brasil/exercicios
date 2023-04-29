# [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um fumante perderá e exiba o total em dias.

cigarros_fumados_dia = int(input('Digite a quantidade de cigarros fumados por dia: '))
anos_fumando = int(input('Digite há quantos anos você fuma: '))

dias_fumando = anos_fumando * 365
minutos_perdidos = cigarros_fumados_dia * dias_fumando * 10
tempo_perdido = minutos_perdidos / 1440  # O número 1440 representa a quantidade de presentes minutos em um dia

print(f'Uma pessoa que fuma {cigarros_fumados_dia} por dia durante {anos_fumando} anos perdeu ≅ {tempo_perdido:.0f} dias de vida.')
