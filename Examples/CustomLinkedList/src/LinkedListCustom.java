import java.util.NoSuchElementException;

public class LinkedListCustom {

    //some fuctionallity will not be provided

    //linklist is full of nodes
    //nodes have all info we need
    //only need nodes
    //singular linked list
    //first node is head node
    private Node head;

    //when making brand new
    //head is not pointing any where so currently null

    public LinkedListCustom() {

        head = null;

    }


    //we wnat to test is the list empty
    //if head is null
    public boolean isEmpty () {

        return head == null;

    }

    //adding to the front is O(1) we only need to adjust pointers
    //want to be able to add any object

    public void addToFront (Object obj) {

        //test if empty
        //if we are add new node point next null
        //if we are not add new node point next to head

        if (isEmpty()) {

            head = new Node(obj, null);

        }else {

            head = new Node(obj, head);

        }

    }

    //remove from singular linklist
    //need to start at the front and traverse through
    //however, if list is empty cannot do remove
    //when removing we want to return the object's value that we removed

    public Object removeFromTail () {

        //if list empty throw exception

        if (isEmpty()) {

            throw new NoSuchElementException("Cannot remove item from empty list");

        }

        //need to know the current Node we are on
        //need to know the previous Node so readjust reference at the end
        //since we are singular linked, once we moved past the Node, we cannot go back

        Node currentNode = head;
        Node previousNode = null;

        while (currentNode.getNext() != null) {

            previousNode = currentNode;
            currentNode = currentNode.getNext();

        }

        //current node will be the tail
        Object removed = currentNode.getData();

        if (previousNode == null) {

            head = null;

        }else {

            previousNode.setNext(null);

        }

        return removed;

    }



    public String toString() {

        StringBuilder output = new StringBuilder();

        Node currentNode = head;

        while (currentNode != null) {

            output.append(currentNode.getData());
            output.append("\n\n");
            currentNode = currentNode.getNext();

        }

        return output.toString();

    }
    

}
