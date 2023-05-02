#include <iostream>

int main() {
    // Definição da variavel do tipo string
    // os tipos das variaveis do C++ precisam ser explicitamente declarados
    std::string nome_da_pessoa;

    // printando ... para cout (output padrão)
    std::cout << "Qual é o seu nome? ";

    // lendo o valor de cin (input padrão) para variavel ...
    std::cin >> nome_da_pessoa;

    // printando resultado, note que os texto e a variavel são separados por <<
    // no objeto cout isso significa que estamos escrevendo para o output padrão
    // Já no >> em cin significa que estamos lendo do input padrão
    std::cout << "Olá " << nome_da_pessoa << ", é um prazer te conhecer!\n";
    
    return 0;
}
