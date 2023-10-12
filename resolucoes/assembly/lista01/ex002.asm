;; 2. Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas para ela.

section .data
    prompt   db "Qual o seu nome? ", 0x00
    ola      db "Olá ", 0x00
    saudacao db " é um prazer te conhecer!", 0x0a, 0x00

;; Seção de variaveis não iniciadas
section .bss
    nome resb 64 ;; reserva 64 elementos para var de tamanho byte

section .text
global _start
_start:
    ;; printa "Qual seu nome? "
    mov rdi, prompt
    call print_it

    ;; lê o nome do usuário para a variavel <nome>
    mov rdi, nome
    mov rsi, 64
    call read_it

    ;; printa o "Olá "
    mov rdi, ola
    call print_it

    ;; move o endereço da variavel <nome> para o registrador <rdi>
    ;; por convenção o registrador <rdi> é comumente usado para o primeiro
    ;; elemente de uma função, e aqui ele é argumento da função size_count
    ;; descrito na linha 69 desse código
    mov rdi, nome
    call size_count
    mov byte [nome + rax - 1], 0x2c ;; muda o ultimo elemento da string para uma virgula
    ;; como <rdi> já tem o valor de <nome> aqui chamamos direto a função print_it
    ;; definida na linha 49 desse código
    call print_it

    ;; printa a <saudacao> na tela
    mov rdi, saudacao
    call print_it

    ;; exits
    mov rax, 60
    mov rdi, 0
    syscall

;; função para imprimir na tela
print_it:
    ;; chama a função size_count com o <rdi> já setado da chamada principal
    call size_count
    mov rdx, rax ;; rdx recebe o retorno de size_count por meio do registrador <rax>
    mov rsi, rdi ;; rsi recebe o endereço da variavel por meio de <rdi>
    mov rax, 1   ;; indica para o syscall que se trata de uma sys_write
    mov rdi, 1   ;; indica para o syscall que o sys_write será para o stdout
    syscall
    ret

;; função para ler do stdin
read_it:
    mov rax, 0   ;; indica para o syscall que se trata de uma sys_read
    mov rdx, rsi ;; tamanho do buffer
    mov rsi, rdi ;; endereço do buffer
    mov rdi, 0   ;; indica para o sys_read que deve ler do stdin
    syscall
    ret

;; função para ler uma string e retornar o número de elementos
size_count:
    ;; move o endereço da string por meio de <rdi> para o registrador <rax>
    ;; para fins de manipulação
    mov rax, rdi
    mov rcx, 0 ;; por convenção <rcx> é usado como counter

    start_loop: ;; label de inicio do loop (nome qualquer)
        cmp byte [rax + rcx], 0x00 ;; compara se o elemto <n> com 0x00 (null)
        je end_loop ;; se for igual pula para o label end_loop
        
        ;; "se não"
        inc rcx        ;; incremente o valor do counter
        jmp start_loop ;; volta pro inicio do loop
    end_loop:
    mov rax, rcx ;; retorna o valor do counter por meio do registrador <rax>
    ret