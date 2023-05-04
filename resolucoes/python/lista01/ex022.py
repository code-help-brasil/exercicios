# Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
# — Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
# — Se já estiver depois dos 18 anos, mostre quantos anos já se passaram do alistamento.

from datetime import date
ano_atual = date.today().year

ano_nascimento = int(input('Digite seu ano de nascimento: '))
idade = ano_atual - ano_nascimento


if idade >= 18:
    print(f'Você precisa se alistar, já se passaram {idade - 18} anos do alistamento obrigatório!')
else:
    print(f'Você precisará se alista daqui {18 - idade} anos.')
