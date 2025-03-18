public class Pilha {

    No head = null;
    int index = 0;
    public void push(String mes){
        No aux = new No(mes);
        
        if(head == null){
            head = aux;
            index++;
        }
        else{
            aux.setProximo(head);
            head = aux;
            index++;
        }

}

    public void pop(){
    if(head == null){
    }else{
        head = head.getProximo();
        index--;
    }

    }

    public String peek(){
        if(head == null){
            return null;
        }
        else{
            return head.getMes() + " " + index;
        }
    }

// Falta terminar
    public void pop2(int index){
        No aux = null;
        while(index != this.index){
            aux.setMes(head.getMes());
            aux.setProximo(head.getProximo());
            index++;
        }

    }
}