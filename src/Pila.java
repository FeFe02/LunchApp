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

class Nodo {
    String nombre;
    String facultad;
    String universidad;
    String restaurante;
    Nodo next;
  
    public Nodo(String nombre, String facultad, String universidad, String restaurante) {
      this.nombre = nombre;
      this.facultad = facultad;
      this.universidad = universidad;
      this.restaurante = restaurante;
      this.next = null;
    }
  }

class Main{
    public static void main (String args[]){
        Pila s = new Pila();
        s.pilaPush("Ana", "Ingeniería", "Universidad Nacional", "Yutakeuchi");
        //s.pilaPush(20);
        System.out.println(s.pilaSize());

        System.out.println(s.pilaPop());
        System.out.println(s.pilaPop());
        System.out.println(s.pilaSize());	
    }
}