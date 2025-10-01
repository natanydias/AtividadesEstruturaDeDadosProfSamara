//Questão 04 - Implemente uma classe Pilha em Java que utilize arrays para
//armazenar inteiros. Sua classe deve possuir:
//1.Um construtor que receba a capacidade máxima da pilha.
//2.O método push(int valor) para inserir um elemento no topo.
//3.O método pop() para remover e retornar o elemento do topo.
//4.O método peek() para consultar o elemento no topo sem removê-lo.
//5.O método isEmpty() que retorna true se a pilha estiver vazia.
//No método main, crie uma pilha de tamanho 5, insira três valores,
//exiba o elemento do topo, e depois remova todos os elementos
//mostrando a saída no console.

public class Pilha {
    private int[] dados;   // array para armazenar os elementos
    private int topo;      // índice do topo da pilha
    private int capacidade;

    // 1. Construtor que recebe a capacidade máxima
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1; // pilha começa vazia
    }

    // 2. push(int valor) - insere elemento no topo
    public void push(int valor) {
        if (topo == capacidade - 1) {
            throw new IllegalStateException("Pilha cheia!");
        }
        dados[++topo] = valor;
    }

    // 3. pop() - remove e retorna elemento do topo
    public int pop() {
        if (isEmpty()) {
            return -1; // ou poderia lançar exceção
        }
        return dados[topo--];
    }

    // 4. peek() - consulta o elemento do topo sem remover
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return dados[topo];
    }

    // 5. isEmpty() - verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == -1;
    }
}

