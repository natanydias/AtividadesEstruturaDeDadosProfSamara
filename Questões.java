//Questão 01 - Um aplicativo de edição de texto permite que o usuário use a função
//"Desfazer" (Ctrl+Z). Cada ação realizada pelo usuário precisa ser
//desfeita na ordem inversa em que aconteceu.
//Qual estrutura de dados é mais adequada para essa situação: fila ou
//pilha? Explique.

//Resposta: A estrutura mais adequada é a pilha, porque as ações devem 
//ser desfeitas na ordem inversa em que foram realizadas 
//(última ação → primeira a ser removida).

//Questão 02 - Um hospital precisa organizar os exames realizados em pacientes
//durante o dia. Cada exame é registrado em ordem cronológica. No fim
//do dia, o sistema deve imprimir esses exames na ordem inversa à que
//foram feitos (do último para o primeiro).
//Que estrutura você usaria para guardar os exames: fila ou pilha?
//Implementaria com array ou lista encadeada? Justifique.

//Resposta: Use uma pilha para armazenar os exames e implemente-a com 
//lista encadeada, pois permite flexibilidade no número de elementos e 
//facilita o crescimento dinâmico da estrutura.

//Questão 03 - Um sistema precisa controlar tarefas usando simultaneamente 
//uma fila e uma pilha. As tarefas chegam e são inseridas na fila, mas algumas 
//tarefas prioritárias precisam ser movidas imediatamente para a pilha, sendo 
//resolvidas antes das demais. Explique qual será a ordem final de execução das 
//tarefas e justifique o porquê, considerando o funcionamento das duas estruturas.

//Resposta: Primeiro esvazia a pilha de prioridades (sempre pegando a última 
//tarefa prioritária que entrou).Só depois continua a fila de tarefas normais 
//em ordem de chegada.