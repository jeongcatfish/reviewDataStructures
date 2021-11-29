import java.util.EmptyStackException;

class Stack<T>{

    class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }

    private Node<T> top;

    public T pop(){
        if(top == null){
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T peek(){
        if(top == null){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void printAll(){
        while(top.next != null){
            System.out.println(top.data);
            top = top.next;
        }
        System.out.println(top.data);
    }
}


public class TestStack {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.pop();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        s.peek();
        s.printAll();
    }

}
