class Node {
    String page;
    Node next;
    Node prev;

    public Node(String page, Node next, Node prev) {
        this.page = page;
        this.next = next;
        this.prev = prev;
    }

    public Node(String page) {
        this.page = page;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory {
    Node head;
    Node cur;


    public BrowserHistory(String homepage) {
        head = cur = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newPage = new Node(url);
        cur.next = newPage;
        newPage.prev = cur;
        cur = newPage;
    }
    
    public String back(int steps) {
        while(steps > 0 && cur.prev!=null){
            cur = cur.prev;
            steps--;
        }
        return cur.page;
    }
    
    public String forward(int steps) {
        while(steps > 0 && cur.next!=null){
            cur = cur.next;
            steps--;
        }
        return cur.page;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */