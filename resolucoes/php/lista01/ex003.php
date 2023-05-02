<?php
/*Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem. ex:
* Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
*/

$inputNome = (string) readline("Digite seu nome: ");

$inputSalario = (float) (readline("Digite seu salalario: "));

if (empty($inputNome)) {
  echo "Digite um nome!\n";
} else if ($inputSalario == 0) {

  echo "Este valor nao é permitido\n";
} else {
  $salario = number_format($inputSalario, 2, '.', ' ');
  echo "O funcionário $inputNome tem um salário de R$$salario em Junho";
}
