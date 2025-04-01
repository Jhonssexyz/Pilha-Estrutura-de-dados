public class App {
    public static void main(String[] args) throws Exception {
       Pilha pilha = new Pilha();

       pilha.push(1);
       pilha.push(2);
       pilha.push(3);
       pilha.push(4);

       System.out.println(pilha.peek());

       pilha.pop();

       System.out.println(pilha.peek());
    }
}
