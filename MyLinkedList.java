package text05;

public class MyLinkedList {


    private Node head;
    private int size;

    public MyLinkedList() {
        head = new Node();
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    //  1 2 3
//  0
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        index = Math.max(0, index);
        size++;
        Node pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        Node toAdd = new Node(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 && index >= size) {
            return;
        }
        size--;
        Node pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }

}
class Node {
    public Node next;
    public int val;

    public Node(Node next, int val) {
        this.next = next;
        this.val = val;
    }

    public Node(int val) {
        this.val = val;
        next = null;
    }

    public Node() {

    }
}


