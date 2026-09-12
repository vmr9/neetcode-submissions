class BrowserHistory {
    List<String> history;
    int i, len;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        i = 0;
        len = 1;
    }
    
    public void visit(String url) {
        if(i+1 < history.size()){
            history.set(i+1, url);
        } else {
            history.add(url);
        }
        i++;
        len = i+1;
    }
    
    public String back(int steps) {
        i = Math.max(i-steps, 0);
        return history.get(i);
    }
    
    public String forward(int steps) {
        i = Math.min(i+steps, len-1);
        return history.get(i);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */