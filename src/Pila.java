public class Stack {
    
    //Creación del nodo
    private class stackNodo{
        Nodo data;
        stackNodo next;
        
        public stackNodo (T val, Nodo x){
            data = val;
            next = nodo;
        }

        public void setData (T val) {
	        data = val;
	    }
	
	    public T getData () {
	        return data;
	    }
	
    	public Node getNext () {
    	    return next;
    	}
    	
    	public void setNext (Node n) {
    	    next = n;
    	}
    }


    //Creación del stack a usar
    stackNodo top;
    int size;

    //Constructor de la clase
    public Stack(){
        top = null;
        size = 0;
    }

    //Método Push
    public void stackPush(T val){
        stackNodo nodo = new stackNodo(val, top);
        top = nodo;
        System.out.println("Pusheo correcto");
        size++;
    }

    //Método Pop
    public T stackPop(){
        if (top == null) return null;
        else{
            data = top.getData();
            stackNodo temp = top;
            top = top.getNext();
            tmp.setNext(null);
            size--;
        }
        return data;
    }

    //Método size
    public int stackSize(){
        return size;
    }

    //Método IsEmpty
    public boolean stackVacio(){
        return top == null;
    }

    //Método Peek
    public T peek(){
        T data = null
        if (top == null) return null;
        else data = top.getData();
        return data;
    }



}

class Main{
    public static void main (String args[]){
        Stack s = new Stack();
        s.stackPush("Ana", "Ingeniería", "Universidad Nacional", "Yutakeuchi");
        //s.pilaPush(20);
        System.out.println(s.pilaSize());

        System.out.println(s.pilaPop());
        System.out.println(s.pilaPop());
        System.out.println(s.pilaSize());	
    }
}
