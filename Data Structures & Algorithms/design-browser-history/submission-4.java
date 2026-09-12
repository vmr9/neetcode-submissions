class BrowserHistory {
    List<String> history;
    int len;
    int i;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        len = 1;
        i = 0;
    }
    
    public void visit(String url) {
        i++;
        if(i < history.size()){
            history.set(i, url);
        } else {
            history.add(url);
        }
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