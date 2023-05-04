# Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.

ano = int(input('Digite um ano: '))

if ano % 4 == 0 and ano % 100 == 0 and ano % 400 == 0 or ano % 4 == 0 and ano % 100 != 0:
    print(f'O ano {ano} é bissexto.')
else:
    print(f'O ano {ano} não é bissexto.')

# OR
# import calendar
# ano = int(input('Digite um ano: '))
# ano_bissexto = calendar.isleap(ano)
# if ano_bissexto is True:
#     print(f'O ano {ano} é bissexto.')
# else:
#     print(f'O ano {ano} não é bissexto.')
