class ListNode {
    private ListNode next;
    private int val;

    public ListNode(int val){
        this.val = val;
    }
}

class MyLinkedList {

    ListNode head;
    int size;

    public MyLinkedList() {
        head = new ListNode(0);
        size = 0;
    }
    
    public int get(int index) {
        if(index >= size || index < 0){
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
        if(index<0 || index > size){
            return;
        }
        ListNode node = getPrev(index);
        ListNode newNode = new ListNode(val);
        newNode.next = node.next;
        node.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return;
        }
        ListNode node = getPrev(index);
        node.next = node.next.next;
        size--;
    }

    public ListNode getPrev(int index) {
        if(index < 0 || index > size){
            return null;
        }
        ListNode curr = head;
        for(int i=0; i<index; i++){
            curr = curr.next;
        }
        return curr;
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