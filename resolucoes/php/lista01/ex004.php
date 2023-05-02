<?php
/*Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles. ex:

Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.
*/

$valor1 = (float)readline('Digite um valor A: ');
$valor2 = (float)readline('Digite um valor B: ');

$total = $valor1 + $valor2;

echo "\rA soma entre $valor1 e $valor2 é igual a $total";