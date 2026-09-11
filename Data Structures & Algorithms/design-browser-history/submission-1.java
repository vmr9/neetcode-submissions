class Node {
    String page;
    Node next;
    Node prev;

    public Node(String page, Node next, Node prev){
        this.page = page;
        this.next = next;
        this.prev = prev;
    }

    public Node(String page){
        this.page = page;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory {
    Node head;
    Node curr;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        curr = head;
    }
    
    public void visit(String url) {
        Node newPage = new Node(url, null, curr);
        curr.next = newPage;
        curr = curr.next;
    }
    
    public String back(int steps) {
        while(curr.prev != null && steps > 0){
            curr = curr.prev;
            steps--;
        }
        return curr.page;
    }
    
    public String forward(int steps) {
        while(curr.next != null && steps > 0){
            curr = curr.next;
            steps--;
        }
        return curr.page;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */