# Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

velocidade = float(input('Digite a velocidade do carro: '))

if velocidade > 80:
    multa = (velocidade - 80) * 5
    print(f'Você foi multado por ultrapassar 80km/h, sua multa é de: R${multa:.2f}.')
else:
    print('Você está dentro do limite de velocidade estabelecido.')
