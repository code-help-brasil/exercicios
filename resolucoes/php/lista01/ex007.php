<?php
/*
Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte. ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666
*/

$inputValue = readline('Digite um número: ');

if (preg_match('/^[+-]?\d*\.?\d+$/', $inputValue)) {
  $number = floatval($inputValue);
  $dobro = 2 * $number;
  $terca = round(($number/3),5);

  print "O dobro de $number é $dobro \n";
  print "A terça parte de $number é $terca.\n";
} else {
  echo "A entrada deve conter apenas números.";
}