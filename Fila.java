//Questão 05 - Implemente uma classe Fila em Java que utilize arrays para armazenar
//inteiros. Sua classe deve possuir:
//1.Um construtor que receba a capacidade máxima da fila.
//2.O método enqueue(int valor) para inserir um elemento no final da fila.
//3.O método dequeue() para remover e retornar o elemento do início da fila.
//4.O método peek() para consultar o primeiro elemento sem removê-lo.
//5.O método isEmpty() que retorna true se a fila estiver vazia.
//No método main, crie uma fila de tamanho 5, insira três valores, exiba o
//primeiro elemento, e depois remova todos os elementos mostrando a saída
//no console.

public class Fila {
    private int[] dados;
    private int frente;     // índice do início da fila
    private int tras;       // índice do final da fila
    private int tamanho;    // quantidade de elementos
    private int capacidade;

    // 1. Construtor que recebe a capacidade máxima
    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.frente = 0;
        this.tras = -1;
        this.tamanho = 0;
    }

    // 2. enqueue(int valor) - insere no final da fila
    public void enqueue(int valor) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("Fila cheia!");
        }
        tras = (tras + 1) % capacidade; // avanço circular
        dados[tras] = valor;
        tamanho++;
    }

    // 3. dequeue() - remove e retorna o primeiro elemento
    public int dequeue() {
        if (isEmpty()) {
            return -1; // ou poderia lançar exceção
        }
        int valor = dados[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return valor;
    }

    // 4. peek() - consulta o primeiro elemento sem remover
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return dados[frente];
    }

    // 5. isEmpty() - verifica se a fila está vazia
    public boolean isEmpty() {
        return tamanho == 0;
    }
}
