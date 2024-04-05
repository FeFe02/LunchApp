

class Node{
    private int data;
    private Node next;
    
    public Node(){
        this(0);
    }
    public Node(int data){
        this.data = data;
        next = null;
    }
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
}

public class QueueRef {
    
    private Node front, rear;
    
    public QueueRef(){
        front = null;
        rear = null;
    }
    
    public void enqueue(int item){
        Node newp = new Node(item);
        if(rear != null){
            rear.setNext(newp);
        } else {
            front = newp;
        }
        rear = newp;
    }
    
    public int dequeue(){
        int item = -1;
        if(!empty()){
            item = front.getData();
            front = front.getNext();
            if(front == null){
                
                rear = null;
            }
        } else {
            System.out.println("Queue is empty: item not dequeued");
        }
        return item; 
   }
    
    public boolean empty(){
        return (front == null);
    }
}

