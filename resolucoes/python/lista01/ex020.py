# Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.

num = int(input('Digite um número inteiro: '))

if num % 2 == 0:
    print(f'O número {num} é par')
else:
    print(f'O número {num} é ímpar')
