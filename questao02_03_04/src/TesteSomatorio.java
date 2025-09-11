class ListaNumeros2 extends ListaNumeros {
    void somatorioMaioresEMenoresQue10() {
        int somaMaiores = 0;
        int somaMenores = 0;

        NumeroNode atual = inicio;
        while (atual != null) {
            if (atual.valor > 10) {
                somaMaiores += atual.valor;
            } else if (atual.valor < 10) {
                somaMenores += atual.valor;
            }
            atual = atual.proximo;
        }

        System.out.println("Soma dos maiores que 10: " + somaMaiores);
        System.out.println("Soma dos menores que 10: " + somaMenores);
    }
}

public class TesteSomatorio {
    public static void main(String[] args) {
        ListaNumeros2 lista = new ListaNumeros2();
        lista.adicionar(5);
        lista.adicionar(12);
        lista.adicionar(7);
        lista.adicionar(15);
        lista.adicionar(10);

        lista.somatorioMaioresEMenoresQue10();
    }
}
