<?php
/*
6. Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor. ex:

Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
*/

$inputValue = readline('Digite um número: ');
if (preg_match('/^[0-9]+$/', $inputValue)) {
  $number = intval($inputValue);
  $sucessor = $number + 1;
  $antessor = $number - 1;
  
  print "O antessor de $number é $sucessor";
  print "O sucessor de $number é $antessor";
} else {
  echo "A entrada deve conter apenas números.";
}

