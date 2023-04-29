# Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas.

distancia = float(input('Digite uma distância em metros: '))

print(f"""
A distância de {distancia}m corresponde a:

{distancia / 1000}km
{distancia / 100}hm
{distancia / 10}dam
{distancia * 10}dm
{distancia * 100}cm
{distancia * 1000}mm
""")
