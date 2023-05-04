// Programas em C++ sempre vão necessitar de incluir as funções
// de alguma biblioteca, nesse caso a <iostream> que é a biblioteca
// padrão de input e output do C++
#include <iostream>

// Todo programa em C++ inicia pela função main (principal)
// argc e argv são parâmetros da função main
// os parâmetros da função main são passados direto da linha de comando
// diferentemente das demais funções onde os parâmetros são passados
// direto no código do programa
int main(int argc, char *argv[]) {
    // Aqui std:: é o namespace que encapsula as funções globais do C++
    // std::cout é exatamente a o objeto cout dentro do namespace std::
    // cout é a saida padrão do programa
    std::cout << "Olá, Mundo!" << std::endl; 
    
    // As funções em C++ quase sempre retornam um valor
    // no caso da função int main() esse valor é um inteiro
    // o zero aqui significa sucesso com base na tabela de ERROR CODES
    return 0;
}
