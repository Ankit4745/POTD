package DAY_24;

public class gfg2 {
    class myQueue {
    
    public int[] arr;
    public int cap;
    public int size;

    // Constructor
    public myQueue(int n) {
        cap=n;
        arr = new int[cap];
        size =0;
        // Define Data Structures
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return size ==0;
    }

    public boolean isFull() {
        // Check if queue is full
        return size == cap;
    }

    public void enqueue(int x) {
        // Enqueue
        if (size == cap){
     
            return;
        }
        arr[size++] =x;
    }

    public void dequeue() {
        // Dequeue
        if (isEmpty()){
   
            return;
        }
        for(int i=1;i<size;i++){
            arr[i - 1] = arr[i];
        }
        size--;
    }

    public int getFront() {
        // Get front element
        if (isEmpty()) {
      
            return -1;
            
        }
        return arr[0];
    }

    public int getRear() {
        // Get last element
        if  (isEmpty()) {
         
            return -1;
            
        }
        return arr[size -1];
    }
}

}
