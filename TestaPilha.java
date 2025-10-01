public class TestaPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5); // cria pilha com tamanho 5

        // inserir três valores
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        // exibir elemento do topo
        System.out.println("Topo da pilha: " + pilha.peek());

        // remover todos os elementos
        while (!pilha.isEmpty()) {
            System.out.println("Removido: " + pilha.pop());
        }
    }
}
