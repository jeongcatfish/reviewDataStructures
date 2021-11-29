class Queue<T>{
    class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if(last != null){
            last.next = newNode;
        }
        last= newNode;
        if(first == null){
            first = last;
        }
    }

    public T pop() throws Exception {
        if(first == null){
            throw new Exception("qeue is empty");
        }
        T item = first.data;
        first = first.next;
        return item;
    }
}

public class TestQueue {

    public static void main(String[] args) throws Exception {
        Queue<Integer> qu = new Queue<>();

        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);

        System.out.println(qu.pop());
        System.out.println(qu.pop());
        System.out.println(qu.pop());
        System.out.println(qu.pop());
    }


}
