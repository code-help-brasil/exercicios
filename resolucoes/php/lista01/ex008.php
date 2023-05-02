<?php
/*
 * Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas. ex:
 *
 * Digite uma distância em metros: 185.72
  A distância de 85.7m corresponde a:
  0.18572Km           1857.2dm
  1.8572Hm           18572.0cm
  18.572Dam           185720.0mm
 */

$inputValue = readline("Digite uma distância em metros: ");

if (preg_match('/^[+-]?\d*\.?\d+$/', $inputValue)) {
  $number = floatval($inputValue);
  $km =  $number / 1000;
  $hm = $number  /100;
  $dam = $number / 10;
  $dm = $number * 10;
  $cm = $number * 100;
  $mm = $number *1000;

  echo "A distãncia de " . number_format($number,1,".",","). "m corresponde a: ";

  print "\nKilometer    : " . $km;
  print "\nDecametro    : " . $dam;
  print "\nCentimetro   : " . $cm;
  print "\nHectometro   : " . $hm;
  print "\nDecimeter    : " . $dm;
  print "\nMilimetro    : " . $mm;
}


