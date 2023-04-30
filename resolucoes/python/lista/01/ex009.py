# Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

saldo = float(input('Digite quanto você tem em reais: '))

valor_dolar = saldo / 3.45

print(f'Com R${saldo} você compra US${valor_dolar}')
