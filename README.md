# Desafio-Basico-Java

Desafio da Digital Innovation One para Java



#### Desafio 1

Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

##### Entrada

Você receberá 1 valor inteiro **N**, onde **N > 0**.

##### Saída

Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 

| Exemplo de Entrada | Exemplo de Saída |
| :----------------: | :--------------: |
|         6          |      2 4 6       |



#### Desafio 2

Você terá o desafio de ler um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 

##### Entrada

O arquivo de entrada contém um valor inteiro.

##### Saída

Imprima a saída conforme exemplo fornecido.

| Exemplo de Entrada |       Exemplo de Saída       |
| :----------------: | :--------------------------: |
|        400         | 1 ano(s) 1 mes(es) 5 dia(s)  |
|        800         | 2 ano(s) 2 mes(es) 10 dia(s) |
|         30         | 0 ano(s) 1 mes(es) 0 dia(s)  |



#### Desafio 3

Norminia é uma professora e pesquisadora renomada de uma famosa Universidade do Brasil, com inúmeras prêmiações e reconhecimento internacional pelo seu trabalho. Recentemente, Norminia foi convidada para ministrar aulas em uma Universidade da Alemanhã. Mesmo falando muito bem a Língua alemã, Norminia ficou um pouco apreensiva com a responsabilidade, mas resolveu aceitar a proposta e encará-la como um bom desafio.

Os estudantes adoraram a metodologia de ensino de Norminia e tudo estava indo super bem, até o momento da aplicação da sua primeira prova. Acostumada a dar notas de 0 (zero) a 100 (cem), ela fez o mesmo na primeira prova da sua turma da Alemanhã. No entanto, os estudante acharam estranho, uma vez que na Alemanhã o sistema de notas é diferente: as notas devem ser dadas como conceitos de A a E. O conceito A é o mais alto, enquanto o conceito E é o mais baixo.

Conversando com outros docentes, ela recebeu a sugestão de utilizar a seguinte tabela, relacionando as notas numéricas com as notas de conceitos:

![img](https://resources.urionlinejudge.com.br/gallery/images/contests/UOJ_167_G.png)

O problema é que Norminia já deu as notas no sistema numérico, e terá que converter as notas para o sistema de letras. No entanto, Norminia precisa preparar as próximas atividades educacionais para os seus alunos, e não tem tempo suficiente para fazer a conversão das notas manualmente.

Você terá o seguinte desafio: escrever um programa que recebe uma nota no sistema numérico e determina o conceito correspondente.

##### Entrada

A entrada contém um único conjunto de testes, que deve ser lido do dispositivo de entrada padrão (normalmente o teclado). A entrada contém uma única linha com um número inteiro **N** (0 ≤ **N** ≤ 100), representando uma nota de prova no sistema numérico.

##### Saída

Seu programa deve imprimir, na saída padrão, uma letra (A, B, C, D, ou E em maiúsculas) representando o conceito correspondente à nota dada na entrada.

| Exemplos de Entrada | Exemplos de Saída |
| :-----------------: | :---------------: |
|         12          |         D         |
|         87          |         A         |
|          0          |         E         |

