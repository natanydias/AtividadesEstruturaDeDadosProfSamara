class ListaNumeros3 extends ListaNumeros2 {
    int contarPares() {
        int count = 0;
        NumeroNode atual = inicio;
        while (atual != null) {
            if (atual.valor % 2 == 0) {
                count++;
            }
            atual = atual.proximo;
        }
        return count;
    }
}

public class TesteContarPares {
    public static void main(String[] args) {
        ListaNumeros3 lista = new ListaNumeros3();
        lista.adicionar(5);
        lista.adicionar(12);
        lista.adicionar(7);
        lista.adicionar(15);
        lista.adicionar(10);

        System.out.println("Quantidade de números pares: " + lista.contarPares());
    }
}
