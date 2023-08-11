<?php
/* 
* 9. Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira
* (em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
*/

$carteira =(float) readline("Quanto você tem na carteira? ");
$conversao = ($carteira / 3.45);

print "U$". sprintf("%.2f", $conversao)."\n";
