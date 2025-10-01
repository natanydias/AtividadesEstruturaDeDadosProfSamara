public class TestaFila {
    public static void main(String[] args) {
        Fila fila = new Fila(5); // cria fila com tamanho 5

        // inserir três valores
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        // exibir o primeiro elemento
        System.out.println("Primeiro da fila: " + fila.peek());

        // remover todos os elementos
        while (!fila.isEmpty()) {
            System.out.println("Removido: " + fila.dequeue());
        }
    }
}
