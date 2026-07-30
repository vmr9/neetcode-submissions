class Node {
    int val;
    Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
        head = new Node(0);
        size = 0;
    }

    public Node getPrev(int index) {
        if(index < 0 || index > size) {
            return null;
        }
        Node cur = head;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        return cur;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) {
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
        if (index < 0 || index > size) return;
        Node prev = getPrev(index);
        Node newNode = new Node(val, prev.next);
        prev.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        Node prev = getPrev(index);
        prev.next = prev.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */