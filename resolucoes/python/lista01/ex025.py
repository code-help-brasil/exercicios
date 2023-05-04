# [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta. Analise seus comprimentos e diga se é possível formar um triângulo com essas retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.

reta1 = float(input('Digite o tamanho da primeira reta: '))
reta2 = float(input('Digite o tamanho da segunda reta: '))
reta3 = float(input('Digite o tamanho da terceira reta: '))

if reta1 < reta2 + reta3 and reta2 < reta3 + reta1 and reta3 < reta1 + reta2:
    print('É possível formar um triângulo com essas três retas.')
else:
    print('Não é possível formar um triângulo para essas três retas')
