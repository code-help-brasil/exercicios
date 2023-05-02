<?php 

/* Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina. exc:

Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
*/

$nota1 = (float)readline('Digite sua nota A: ');
$nota2 = (float)readline('Digite sua nota B: ');

$total = ($nota1 + $nota2)/2;

echo "\rA média entre $nota1 e $nota2 é igual a $total";

