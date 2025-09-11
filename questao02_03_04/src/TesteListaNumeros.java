class NumeroNode {
    int valor;
    NumeroNode proximo;

    NumeroNode(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaNumeros {
    NumeroNode inicio;

    void adicionar(int valor) {
        NumeroNode novo = new NumeroNode(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            NumeroNode atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    int contarMaioresQue10() {
        int count = 0;
        NumeroNode atual = inicio;
        while (atual != null) {
            if (atual.valor > 10) {
                count++;
            }
            atual = atual.proximo;
        }
        return count;
    }
}

public class TesteListaNumeros {
    public static void main(String[] args) {
        ListaNumeros lista = new ListaNumeros();
        lista.adicionar(5);
        lista.adicionar(12);
        lista.adicionar(7);
        lista.adicionar(15);
        lista.adicionar(10);

        System.out.println("Números maiores que 10: " + lista.contarMaioresQue10());
    }
}
