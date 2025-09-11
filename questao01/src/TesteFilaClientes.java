// Questão 1: Lista encadeada de nomes

class ClienteNode {
    String nome;
    ClienteNode proximo;

    ClienteNode(String nome) {
        this.nome = nome;
        this.proximo = null;
    }
}

class FilaClientes {
    ClienteNode inicio;
    ClienteNode fim;

    void enfileirar(String nome) {
        ClienteNode novo = new ClienteNode(nome);
        if (fim != null) {
            fim.proximo = novo;
        }
        fim = novo;
        if (inicio == null) {
            inicio = novo;
        }
    }

    void desenfileirar() {
        if (inicio != null) {
            System.out.println("Removido: " + inicio.nome);
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
        } else {
            System.out.println("Fila vazia.");
        }
    }

    void exibirFila() {
        ClienteNode atual = inicio;
        while (atual != null) {
            System.out.println(atual.nome);
            atual = atual.proximo;
        }
    }
}

public class TesteFilaClientes {
    public static void main(String[] args) {
        FilaClientes fila = new FilaClientes();
        fila.enfileirar("Ana");
        fila.enfileirar("Bruno");
        fila.enfileirar("Carlos");

        System.out.println("Fila:");
        fila.exibirFila();

        fila.desenfileirar(); // Remove Ana

        System.out.println("Fila após remoção:");
        fila.exibirFila();
    }
}
