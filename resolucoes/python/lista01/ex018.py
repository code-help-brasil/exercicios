# Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou não votar.
from datetime import date

ano_atual = date.today().year

ano_nascimento = int(input('Digite o ano em que você nasceu: '))

if ano_atual - ano_nascimento >= 18:
    print('Você tem mais de/ou 18 anos, você já pode votar!')
else:
    print('Você ainda não pode votar!')

