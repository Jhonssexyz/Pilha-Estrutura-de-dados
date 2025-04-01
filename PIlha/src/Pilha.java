public class Pilha {

    Node head;

    public void push(int elemento){
        Node temp = new Node(elemento);

        temp.next = head;
        head = temp;
    }

    public int peek(){
        if(head == null)
        return 0;

        return head.data;
    }

    public boolean pop(){
        if(head == null)
        return false;

        head = head.next;
        return true;
    }
}
