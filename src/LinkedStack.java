 public class LinkedStack {

    class Node {
      Object elem;
      Node Next;
  
      public Node(Object o) {
        elem = o;
        Next = null;
      }
    }
  
    Node end;
    int size;
  
    public LinkedStack() {
      end = null;
      size = 0;
    }
  
    // Método push para insertar objetos en el stack
    public void push(Object o) {
      Node nodo = new Node(o);
      if (end == null)
        end = nodo;
      else {
        nodo.Next = end;
        end = nodo;
      }
      size++;
    }; 
  
    // Método pop para sacar objetos de la pila
    public Object pop() {
      if (end == null)
        return "La pila está vacía.";
      Object o = end.elem;
      end = end.Next;
      size--;
      return o;
    }
  
    // Método isEmpty para ver si está vacía
    public boolean isEmpty() {
  
      return (size == 0);
    }
    
    // Método size
    public int size() {
  
      return size;
    }
  
    // Método top para ver el objeto más arriba de la pila sin sacarlo
    public Object top() {
  
      if (end == null)
        return "La pila está vacía.";
      else
        return end.elem;
    }

    // Método search para buscar un objeto en la pila
    public Object search(Object o){
      Node aux = end;
      boolean existe = false;
      int n = 1;
      while(existe != true && aux != null){
        if ( o == aux.elem ){
          existe = true;         
        }
        else{
          aux = aux.Next;
          n++;
        };
      };
      return "Existe en la posición: " +n;
    }

    // Método printAll para imprimir de final a inicio
    public Object printToBack(){
      Node aux = end;
      for(int i = 1; i <= this.size; i++){
        Object o = aux.elem;
        System.out.println(o);
        aux = aux.Next;
      }
      return "Terminado";
    };

  

    public static void main(String[] args) {
      
      

      LinkedStack lstack = new LinkedStack();

      int n = 10000000;

      //lstack.push("aber");

      //long startTime = System.currentTimeMillis();
      //long startTi = System.nanoTime();
      int x = 0;
      for (int i = 1; i<=n ; i++){
        x++;
        lstack.push("Holi" + x);
      };

      long startTime = System.currentTimeMillis();
      long startTi = System.nanoTime();

      //for (int i = 1; i<=n ; i++){
      System.out.println(lstack.printToBack());
      //};

      long endTi = System.nanoTime();
      long endTime = System.currentTimeMillis();
      System.out.println("Execution time in milliseconds: " + (endTime - startTime));
      System.out.println("Execution time in nanoseconds: " + (endTi - startTi));
      System.out.println("Terminado");

      //lstack.push(1);
      //lstack.push(2);
      //lstack.push("Hola");
      //System.out.println(lstack.pop());
      //System.out.println(lstack.pop());
      //System.out.println(lstack.pop());
      //System.out.println(lstack.isEmpty());
    }


  }

