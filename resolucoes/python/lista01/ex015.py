# Crie um programa que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.

dias_trabalhados = int(input('Digite a quantidade de dias trabalhados: '))

salario = dias_trabalhados * (25 * 8)

print(f'O salário desse funcionário é de: R${salario}')
