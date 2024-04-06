
package colaproyecto;


//Clase Qarray: colaimplementada con arreglo circular
class Qarray<T> {
    
    int front = 0; //casilla inicial
    int rear = 0;  //casilla final
    int count = 0; //elementos de la cola
    int N = 100000000;  //capacidad de la cola
    
    public Qarray(int N){ //Constructor para redefinir capacidad
        this.N = N;
    }
    
    

    
    T[] qarray = (T[]) new Object[N]; //arreglo en el que se crea la cola
    
    
    //Agregar al inicio
    public void enqueueIn(T item) {
        if(full()) {
            System.out.println("Queue is full: item not enqueued"); 
            return;
        }
        front = (front - 1 + N) % N; // Avanzamos front en sentido contrario
        qarray[front] = item;
        count++;          
    }
    
    
    //Agregar al fnal
    public void enqueue(T item){ 
        
        if(full()){
            System.out.println("Queue is full: item not enqueued"); 
        }
        qarray[rear] = item;
        rear = (rear + 1) % N;
        count++;          
                
    }
    
    
    //Eliminar al inicio
    public T dequeue(){        
        
        
        if(empty()){
            throw new RuntimeException("Queue is empty: Item not dequeued");
        }  
        
        T item = qarray[front];
        front = (front + 1) % N;
        count--;
         
        return item;
    }
    
    
    
    //Eliminar al final
    public T dequeueFi() {
        if(empty()) {
            throw new RuntimeException("Queue is empty: Item not dequeued");
        }
        
        rear = (rear - 1 + N) % N; // Retrocedemos rear en sentido contrario
        T item = qarray[rear];
        count--;
        return item;
    }
    
    
    //Buscar
    public boolean buscar(T item) { 
        
        
        boolean find = false;
        
        for (int i = 0; i < count; i++) {
            int index = (front + i) % N;
            if (qarray[index] == item) {
                find =  true;
            }
        }
        return find;
    }
     
   
    
    //Mostrar del final al inicio
    public void showInverse() {
        if(empty()) {
            System.out.println("Queue is empty");
            return;
        }
        int aux = rear - 1;
        for (int i = 0; i < count; i++) {
            int index = (aux + N) % N;
            System.out.print(qarray[index] + " ");
            aux--;
        }
        System.out.println();
    }
    
    
    //full
    public boolean full(){
        
        return count >= N;
        
    }
    
    
    //empty
    public boolean empty(){
        
        return count <= 0;
        
    }
    
}


//Clase Node para implementar cola con lista enlazada
class Node<T> {
    private T data;       //dato del nodo
    private Node<T> next; //Nodo siguiente
    
    
    public Node() {
        this(null);
    }
    
    public Node(T data) {
        this.data = data;
        next = null;
    }
    
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public Node<T> getNext() {
        return next;
    }
    
    public void setNext(Node<T> next) {
        this.next = next;
    }
}


//clase QueueRef para cola implementada como lista enlazada
class QueueRef<T> {
    private Node<T> front, rear;
    
    
    public QueueRef() { //se definen los nodos front y rear
        front = null;
        rear = null;
    }
    
    //Agregar al inicio
    public void enqueueIn(T item) {
        Node<T> newNode = new Node<>(item);
        if (empty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.setNext(front);
            front = newNode;
        }
    }
    
    //Agregar al final
    public void enqueue(T item) {
        Node<T> newp = new Node<>(item);
        if (rear != null) {
            rear.setNext(newp);
        } else {
            front = newp;
        }
        rear = newp;
    }
    
    //Eliminar al inicio
    public T dequeue() {
        T item = null; 
        if (!empty()) {
            item = front.getData();
            front = front.getNext();
            if (front == null) {
                rear = null;
            }
        } else {
            System.out.println("Queue is empty: item not dequeued");
        }
        return item; 
    }
    
    //eliminar al final
    public T dequeueFi() {
        if (empty()) {
            System.out.println("La cola está vacía, no se puede eliminar.");
            return null;
        } else if (front == rear) {
            // Si solo hay un elemento en la cola
            T data = front.getData();
            front = null;
            rear = null;
            return data;
        } else {
            // Si hay más de un elemento en la cola
            Node<T> newNode = front;
            while (newNode.getNext() != rear) {
                newNode = newNode.getNext();
            }
            T data = rear.getData();
            rear = newNode;
            rear.setNext(null);
            return data;
        }
    }
    
    
    //buscar
    public boolean buscar(T item) {
        boolean find = false;
        
        Node<T> comp = front;
        while (comp != null) {
            if (comp.getData() == item) {
                find = true;
            }
            comp = comp.getNext();
        }
        return find;
    }
    
    
    //empty
    public boolean empty() {
        return (front == null);
    }
    
    
    //Mostrar del final al inicio: se utilizan dos metodos para mayor facilidad
    public void showInverse() {
        if (empty()) {
            System.out.println("Queue is empty");
            return;
        }

        showInverseAux(front);
        System.out.println();
    }

    private void showInverseAux(Node<T> node) {
        if (node == null) {
            return;
        }
        showInverseAux(node.getNext());
        System.out.print(node.getData() + " ");
    }
}



public class ColaProyecto {

    public static void main(String[] args) {
        //long startTime = System.currentTimeMillis();
        //long startT = System.nanoTime();
        //array
        int N = 10000000;        
        Qarray<Integer> cola = new Qarray<>(N);
        
        //ref        
        //QueueRef<Integer> cola = new QueueRef<>();
        
        //enqueue
        for(int i = 1; i<= N; i++){
            cola.enqueue(i);
        }
        
        //enqueueIn
        /*for(int i = 1; i<= N; i++){
            cola.enqueueIn(i);
        }*/
        
        long startTime = System.currentTimeMillis();
        long startT = System.nanoTime();
        
        
        
        //dequeue
        /*for(int i = 1; i<= N; i++){
            cola.dequeue();
        }*/
        
        //dequeueFi
        /*for(int i = 1; i<= N; i++){
            cola.dequeueFi();
        }*/
        
        //buscar
        //cola.buscar(40000000);
        
        
        cola.showInverse();
        
        
        
        
        
        long endTime = System.currentTimeMillis();
        long endT = System.nanoTime();
        long duration = (endTime - startTime);
        long dur = (endT - startT);
        double milis = (double)dur/1000000;
        double redondeado = Math.round(milis * Math.pow(10, 2)) / Math.pow(10, 2);
        System.out.println(redondeado+" ms");
        System.out.println("Nanos: "+dur);
    }
}

        
        
