public class Node {

    //Represents a single node in a Linkedlist data structure
    // data will be object type so that we can add any class we want

    private Object data;
    private Node next;

    //need both pieces of info when making a new node

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object newNodeData) {
        this.data = newNodeData;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node newNode) {
        this.next = newNode;
    }
}
