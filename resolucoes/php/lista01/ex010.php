<?php

 function limparTerminal() {
        // Limpa o terminal
        echo "\033[2J\033[;H";
}

limparTerminal();

$HEAD = <<<'HEAD'
====================================================================================

    10. Faça um algoritmo que leia a largura e altura de uma parede, calcule        
    e mostre a área a ser pintada e a quantidade de tinta necessária para o         
    serviço,sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.   

====================================================================================
HEAD;
echo $HEAD."\n\n";


readline("Aperte enter para continuar");
limparTerminal();

$altura = null;
$largura= null;

while (!is_numeric($altura)){
    $altura = (float) readline("Digite a altura da parede: ");
    if (!is_numeric($altura)){
        echo "Altura inválida. Por favor, digite um número válido.\n";
    }
}
while (!is_numeric($largura)){
    $largura = (float) readline("Digite a largura da parede: ");
    if (!is_numeric($largura)){
        echo "Largura inválida. Por favor, digite um número válido.\n";
    }
}

limparTerminal();

$area = (float) $altura * $largura;
$tinta = (float) $area/2;

$resultado =<<<RESULT
====================================================================================

    Em uma parade com uma área de $area m, você gastará $tinta L de tinta

====================================================================================    
RESULT;

echo $resultado."\n\n";
