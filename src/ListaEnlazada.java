public class ListaEnlazada implements Comparable<ListaEnlazada> {

  private Nodo head; // Referencia al primer nodo de la lista

  public ListaEnlazada() {
    this.head = null;
  }

  // Método para agregar un elemento al final de la lista
  public void agregar(String nombre, String facultad, String universidad, String restaurante) {
    Nodo nuevoNodo = new Nodo(nombre, facultad, universidad, restaurante);
    if (head == null) {
      head = nuevoNodo;
    } else {
      Nodo actual = head;
      while (actual.next != null) {
        actual = actual.next;
      }
      actual.next = nuevoNodo;
    }
  }

  // Método para eliminar un elemento por su nombre
  public void eliminar(String nombre) {
    if (head == null) {
      return;
    }
    if (head.nombre.equals(nombre)) {
      head = head.next;
    } else {
      Nodo anterior = head;
      Nodo actual = head.next;
      while (actual != null && !actual.nombre.equals(nombre)) {
        anterior = actual;
        actual = actual.next;
      }
      if (actual != null) {
        anterior.next = actual.next;
      }
    }
  }

  // Método para buscar un elemento por su nombre
  public boolean buscar(String nombre) {
    Nodo actual = head;
    while (actual != null && !actual.nombre.equals(nombre)) {
      actual = actual.next;
    }
    return actual != null;
  }

  // Método para imprimir la lista completa
  public void imprimir() {
    Nodo actual = head;
    while (actual != null) {
      System.out.println("Nombre: " + actual.nombre);
      System.out.println("Facultad: " + actual.facultad);
      System.out.println("Universidad: " + actual.universidad);
      System.out.println("Restaurante: " + actual.restaurante);
      System.out.println();
      actual = actual.next;
    }
  }

  // Comparar dos usuarios por universidad, facultad y restaurante
  @Override
  public int compareTo(ListaEnlazada otraLista) {
    // Comparar por universidad
    int comparacionUniversidad = this.head.universidad.compareTo(otraLista.head.universidad);
    if (comparacionUniversidad != 0) {
      return comparacionUniversidad;
    }

    // Comparar por facultad
    int comparacionFacultad = this.head.facultad.compareTo(otraLista.head.facultad);
    if (comparacionFacultad != 0) {
      return comparacionFacultad;
    }

    // Comparar por restaurante
    int comparacionRestaurante = this.head.restaurante.compareTo(otraLista.head.restaurante);
    if (comparacionRestaurante != 0) {
      return comparacionRestaurante;
    }

    // Si todas las comparaciones son iguales, es un match
    System.out.println("¡Match! - " + this.head.nombre + " y " + otraLista.head.nombre);
    return 0;
  }

  public static void main(String[] args) {
    ListaEnlazada usuario1 = new ListaEnlazada();
    usuario1.agregar("Ana", "Ingeniería", "Universidad Nacional", "Yutakeuchi");

    ListaEnlazada usuario2 = new ListaEnlazada();
    usuario2.agregar("Juan", "Ingeniería", "Universidad Nacional", "Yutakeuchi");

    // Comparar los dos usuarios
    usuario1.compareTo(usuario2);

    ListaEnlazada usuario3 = new ListaEnlazada();
    usuario3.agregar("Pedro", "Derecho", "Universidad Javeriana", "La Puerta Falsa");

    // Comparar usuario1 con usuario3
    usuario1.compareTo(usuario3);
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


  