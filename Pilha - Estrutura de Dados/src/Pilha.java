public class Pilha {

    No head = null;

    public void push(String mes){
        No aux = new No(mes);
        
        if(head == null){
            head = aux;
        }
        else{
            
            head = aux;
            aux.setProximo(head);
            head = aux;
        }

}

    public void pop(){
        No aux = null;
        

    }

    public void peek(){
        
        System.out.println(head.getMes());
        
    }
}