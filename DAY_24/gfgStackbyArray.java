package DAY_24;

public class gfgStackbyArray {
    class myStack {
    public int[] arr;
    public int index;

    public myStack(int n) {
        // Define Data 
        arr = new int[n];
        index =-1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if (index == -1) return true;
        else return false;
    }

    public boolean isFull() {
        // check if the stack is full
        if(index == arr.length-1) return true;
        else return false;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(isFull()) return;
            index++;
        arr[index] =x;
    
        
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(index == -1) return;
        arr[index] = 0;
        index--;
    }

    public int peek() {
        // Returns the top element of the stack
        if(index == -1 )return -1;
        return arr[index];
    }
} 
}
