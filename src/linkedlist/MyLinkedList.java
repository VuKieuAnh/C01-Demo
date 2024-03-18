package linkedlist;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public void add(int index, Object data){
        Node temp = head;
        for (int i = 0; i < index-1 && temp.next!=null; i++) {
            temp = temp.next;
        }
        Node holder = temp.next;
        temp.next= new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
}
