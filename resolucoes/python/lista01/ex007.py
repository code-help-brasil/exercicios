# Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.

num = float(input('Digite um número: '))

dobro = num * 2
terca_parte = num / 3

print(f'O dobro de {num} é {dobro}')
print(f'A terça parte de {num} é {terca_parte:.3f}')
