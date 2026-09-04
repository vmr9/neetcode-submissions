class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
        head = new Node(0);
        size = 0;
    }

    public Node getPrev(int index){
        if(index<0 || index>size){
            return null;
        }
        Node curr = head;
        for(int i=0; i<index; i++){
            curr = curr.next;
        }
        return curr;
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        return getPrev(index).next.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return;
        }
        Node curr = getPrev(index);
        Node newNode = new Node(val);
        Node next = curr.next;
        curr.next = newNode;
        newNode.next = next;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return;
        }
        Node prev = getPrev(index);
        prev.next = prev.next.next;
        size--;
    }
}

