README.md 

 Estruturas de Dados em Java (Pilha, Fila e Merge)

Este repositório contém implementações em Java das seguintes estruturas e operações, utilizando apenas tipos primitivos e listas encadeadas ou vetores:

1. Pilha com lista encadeada
2. Fila com lista encadeada
3. Operação de Merge entre duas filas ordenadas

   * Implementação com vetores
   * Implementação com listas encadeadas

##  Requisitos

* Java JDK 8 ou superior
* Compilador/IDE (Ex: `javac` e `java` no terminal, Eclipse, IntelliJ ou VSCode)

##  Como executar

1. Clone este repositório:

   	bash
   git clone https://github.com/seuusuario/seurepositorio.git
   cd seurepositorio
   

2. Compile o arquivo desejado:

   	bash
   javac NomeDoArquivo.java
   

3. Execute o programa:

   	bash
   java NomeDoArquivo
   

  Programas

 1) Pilha Encadeada

* Implementa os métodos insere, remove e imprime.
* O usuário pode inserir valores pelo teclado para testar a estrutura.
* Sempre que um valor é removido, o programa informa qual foi retirado da pilha.

Exemplo de execução:


Digite um valor para inserir na pilha: 10
Digite um valor para inserir na pilha: 20
Digite um valor para inserir na pilha: 30

Pilha: 10 20 30

Removido o valor 30 do topo da pilha
Pilha: 10 20




 2) Fila Encadeada

* Implementa os métodos insere, remove e imprime.
* O usuário pode inserir valores pelo teclado para testar a fila.
* Sempre que um valor é removido, o programa informa qual foi retirado da fila.

Exemplo de execução:


Digite um valor para inserir na fila: 5
Digite um valor para inserir na fila: 15
Digite um valor para inserir na fila: 25

Fila: 5 15 25

Removido o valor 5 da fila
Fila: 15 25



 3) Merge (Junção de duas filas ordenadas)

	 Versão com Vetor (`MergeArray.java`)

* O usuário informa pelo teclado:

  * Quantidade de elementos da fila A
  * Valores da fila A (em ordem crescente)
  * Quantidade de elementos da fila B
  * Valores da fila B (em ordem crescente)
* O programa gera a Fila C contendo todos os elementos em ordem crescente.

Exemplo de execução:


Quantos elementos terá a fila A? 4
Digite os elementos da fila A (em ordem crescente):
12 35 52 64
Quantos elementos terá a fila B? 5
Digite os elementos da fila B (em ordem crescente):
5 15 23 55 75

Fila A: 12 35 52 64
Fila B: 5 15 23 55 75

Resultado (Fila C): 5 12 15 23 35 52 55 64 75


 Versão com Lista Encadeada (`MergeList.java`)

* Funciona da mesma forma que a versão com vetor, mas utilizando nós encadeados.

Exemplo de execução:


Quantos elementos terá a fila A? 3
Digite os elementos da fila A (em ordem crescente):
1 4 7
Quantos elementos terá a fila B? 4
Digite os elementos da fila B (em ordem crescente):
2 3 5 8

Fila A: 1 4 7
Fila B: 2 3 5 8

Resultado (Fila C): 1 2 3 4 5 7 8
