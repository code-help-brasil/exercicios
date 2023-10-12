;; 1. Escreva um programa que mostre na tela a mensagem "Olá, Mundo!".

;; Seção de variaveis com valor inicial
section .data
    ;; Armazena na variavel 'msg' do tamanho byte (8-bits) a string "Olá Mundo!"
    ;; juntamente com os caracteres para newline e null em ASCII
    msg db "Olá Mundo!", 0x0a, 0x00

;; Seção de código/text
section .text
global _start
_start:
    mov rax, 1   ;; move para o registrador da CPU <rax> o valor 1 (sys_write)
    mov rdi, 1   ;; move para o registrador <rdi> o valor 1 (stdout)
    mov rsi, msg ;; move para o registrador <rsi> o endereço da variavel <msg>
    mov rdx, 12  ;; move para o registrador <rdx> a quantidade de caraceteres de <msg>
    syscall      ;; chama syscall para 1 (sys_write) com os valores de rdi, rsi e rdx
                 ;; equivalete em C write(int fd, const void *buf, size_t count);

    ;; chama o syscall 60 (sys_exit) e passa o argumento 0 (rdi = 0 = sucesso)
    mov rax, 60
    mov rdi, 0
    syscall
