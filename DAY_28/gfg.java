package DAY_28;
public class gfg {
    class myStack {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        // Inserts an element x at the top of the stack
        q.add(x);
        int sz = q.size();
        for (int i=0;i<sz-1;i++){
            q.add(q.peek());
            q.poll();
        }
    }

    void pop() {
        // Removes an element from the top of the stack
        if (q.size() !=0) q.poll();
    }

    int top() {
        // Returns the top element of the stack
        // If stack is empty, return -1
        if (q.size() == 0) return -1;
        else return q.peek();
    }

    int size() {
        // Returns the current size of the stack
        return q.size();
    }
}

}
