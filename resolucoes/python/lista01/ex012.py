# Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.

valor = float(input('Digite um preço para calcular seu desconto de 5%: '))

desconto = valor - valor * 0.05
print(f'O preço com desconto é de: R${desconto:.2f}')
