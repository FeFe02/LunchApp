public class Pila {

    private class pilaNodo{
        Nodo data;
        pilaNodo next;
        pilaNodo (Nodo x){
            data = x;
            next = null;
        }
    }

        pilaNodo top;
        int size;
        Pila(){
            this.top = null;
            this.size = 0;
        }

    public void pilaPush(Nodo x){
        pilaNodo element = new pilaNodo(x);
        element.next = top;
        top = element;
        System.out.println("Pusheo correcto");
        size++;
    }

    public Nodo pilaPop(){
        if (top == null) return null;
        Nodo topData = top.data;
        pilaNodo temp = top;
        top = top.next;
        return topData;
    }

    public int pilaSize(){
        return size;
    }

    public boolean pilaVacia(){
        return top == null;
    }



}
