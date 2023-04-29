# Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.

salario = float(input('Digite o salário de funcionário para caclcular o aumento de 15%: '))

aumento = salario + salario * 0.15
print(f'O salário do funcionário com o aumento é de: R${aumento:.2f}')
