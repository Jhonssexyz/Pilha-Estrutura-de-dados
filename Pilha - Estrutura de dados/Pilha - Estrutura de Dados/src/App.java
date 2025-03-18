public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();

        pilha.push("Janeiro");
        pilha.push("Fevereiro");
        pilha.push("Março");
        pilha.push("Abril");
      

        System.out.println(pilha.peek());
        pilha.pop();
        
    }
}
