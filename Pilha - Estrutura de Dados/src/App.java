public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();

        pilha.inserir("Janeiro");
        pilha.inserir("Fevereiro");
        pilha.inserir("Março");
        pilha.inserir("Abril");
        pilha.inserir("Maio");

        pilha.peek();

    }
}
