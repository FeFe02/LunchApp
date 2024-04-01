public class Stack {
    
    //Creación del nodo
    private class stackNodo{
        T data;
        stackNodo next;
        
        public stackNodo (T val, stackNodo x){
            data = val;
            next = x;
        }

        public void setData (T val) {
	        data = val;
	    }
	
	    public T getData () {
	        return data;
	    }
	
    	public stackNodo getNext () {
    	    return next;
    	}
    	
    	public void setNext (stackNodo x) {
    	    next = x;
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
		T data = null;
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
        T data = null;
        if (top == null) return null;
        else data = top.getData();
        return data;
    }



}
