
public class Qarray {
    
    int front = 0;
    int rear = 0;
    int count = 0;
    int N = 1000000;
    
    public Qarray(int N){
        this.N = N;
    }
    
   
    

    
    int qarray[] = new int[N];
    
    public void enqueue(int item){
        
        if(full()){
            System.out.println("Queue is full: item not enqueued"); 
        }
        qarray[rear] = item;
        rear = (rear + 1) % N;
        count++;          
                
    }
    
    public int dequeue(){
        
        int item = -1;
        
        if(empty()){
            System.out.println("Queue is empty: item not dequeued");
        } else {
        
        item = qarray[front];
        front = (front + 1) % N;
        count--;
                }
        return item;
    }
    
    public boolean full(){
        
        return count >= N;
        
    }
    
    public boolean empty(){
        
        return count <= 0;
        
    }
    
}
