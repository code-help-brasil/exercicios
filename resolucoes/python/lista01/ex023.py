# Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres. Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo que:
# — Homens ganham 5% de desconto
# — Mulheres ganham 13% de desconto

nome = str(input('Digite seu nome: ')).strip()
sexo = int(input("""Qual seu sexo?
1 - Mulher
2 - Homem
Opção: """))
valor_compras = float(input('Digite o valor das compras: '))

if sexo == 1:
    valor_compras = valor_compras * 0.87
    print(f'Suas compras ficaram no valor de {valor_compras}')

elif sexo == 2:
    valor_compras = valor_compras * 0.95
    print(f'Suas compras ficaram no valor de {valor_compras}')
else:
    print('Selecione uma opção válida para o sexo.')
