import java.util.LinkedList;
import java.util.Queue;


public class Usuario {

    public String nombre;
    public String universidad;
    public String facultad;
    public String restaurante;

    // Constructor
    public Usuario(String nombre, String universidad, String facultad, String restaurante) {
        this.nombre = nombre;
        this.universidad = universidad;
        this.facultad = facultad;
        this.restaurante = restaurante;
    }
    
    public static void main(String[] args) {
        // Crear una cola de usuarios
        Queue<Usuario> colaUsuarios = new LinkedList<>();

        // Crear los objetos Usuario y agregarlos a la cola
        Usuario Alejandro = new Usuario( "Alejandro", "Universidad de los Andes", "Derecho", "Plazoleta Lleras");
        Usuario Ana= new Usuario("Ana", "Universidad Nacional", "Ingenieria", "Yutakeuchi");
        Usuario Ezequiel = new Usuario("Ezequiel", "Universidad Javeriana", "Artes", "Comedor de Artes");
        Usuario Camila = new Usuario("Camila", "Universidad de Antioquia", "Humanas", "Comedor Central");
        Usuario Diego = new Usuario("Diego", "Universidad del Rosario", "Ciencias", "Comedores de loto");
        Usuario Mariana = new Usuario("Mariana", "Universidad icesi", "Derecho", "Altos del palo");
        Usuario Beatriz = new Usuario("Beatriz", "Universidad del Norte", "Ingenieria", "Le petit");
        Usuario David = new Usuario("David", "Universidad de la Costa", "Artes", "comedor H");
        Usuario Claudia = new Usuario("Claudia", "Universidad Bolivariana", "Humanas", "Comedor General");
        Usuario Esteban = new Usuario("Esteban", "Universidad Externado", "Ciencias", "Comedor A");
        Usuario Andrea = new Usuario("Andrea", "Universidad Externado", "Ciencias", "Comedor A");
        Usuario Carolina= new Usuario("Carolina", "Universidad Nacional", "Ingenieria", "Yutakeuchi");
        Usuario Andres = new Usuario("Andres", "Universidad Nacional", "Ciencias", "Biologia");
        Usuario Bruno = new Usuario("Bruno", "Universidad Nacional", "Ingenieria", "Comedor Central");
        Usuario Julia = new Usuario("Julia", "Universidad Nacional", "Ingenieria", "Yutakeuchi");
        Usuario Fernando = new Usuario("Fernando", "Universidad Nacional", "Ingenieria", "Yutakeuchi");
        Usuario Juan = new Usuario("Juan", "Universidad Nacional", "Ciencias", "Biologia");
        Usuario Erika = new Usuario("Erika", "Universidad de los Andes", "Ingenieria", "Las Monas");
        Usuario Cecilia = new Usuario("Cecilia", "Universidad Nacional", "Derecho", "Comedor de Economicas");
        Usuario Adriana = new Usuario("Adriana", "Universidad Javeriana", "Ingenieria", "Comedor de Artes");
        Usuario Leonardo = new Usuario("Leonardo", "Universidad de Antioquia", "Artes", "Comedor Central");
        Usuario Enrique = new Usuario("Enrique", "Universidad del Rosario", "Ingenieria", "Comedores de loto");
        Usuario Diana = new Usuario("Diana", "Universidad icesi", "Ciencias", "Altos del Palo");
        Usuario Maria = new Usuario("Maria", "Universidad del Norte", "Derecho", "Le petit");
        Usuario Gonzalo = new Usuario("Gonzalo", "Universidad de la Costa", "Ingenieria", "Comedor H");
        Usuario Laura = new Usuario("Laura", "Universidad Bolivariana", "Artes", "Comedor General");
        Usuario Aron = new Usuario("Aron", "Universidad Externado", "Humanas", "Comedor G");
        Usuario Luisa = new Usuario("Luisa", "Universidad de los Andes", "Ciencias", "Plazoleta Lleras");
        Usuario Francisco = new Usuario("Francisco", "Universidad de los Andes", "Derecho", "Crepes");
        Usuario Guillermo = new Usuario("Guillermo", "Universidad de los Andes", "Ingenieria", "Las Monas");
        Usuario Daniela = new Usuario("Daniela", "Universidad de los Andes", "Artes", "Crepes");
        Usuario Eduardo = new Usuario("Eduardo", "Universidad Nacional", "Humanas", "Central");
        Usuario Felipe = new Usuario("Felipe", "Universidad Javeriana", "Ciencias", "Subway");
        Usuario Natalia= new Usuario("Natalia", "Universidad de Antioquia", "Derecho", "Comedor Central");
        Usuario Antonio= new Usuario("Antonio", "Universidad del Rosario", "Ingenieria", "Comedores de loto");
        Usuario Rafael= new Usuario("Rafael", "Universidad icesi", "Artes", "Altos del Palo");
        Usuario Jorge= new Usuario("Jorge", "Universidad del Norte", "Humanas", "Le petit");
        Usuario Estefania = new Usuario("Estefania", "Universidad de la Costa", "Ciencias", "Comedor H");
        Usuario Ignacio= new Usuario("Ignacio", "Universidad Bolivariana", "Derecho", "Comedor General");
        Usuario Isabel= new Usuario("Isabel", "Universidad Externado", "Ingenieria", "Comedor G");
        Usuario Kevin= new Usuario("Kevin", "Universidad de los Andes", "Artes", "Crepes");
        Usuario Jessica = new Usuario("Jessica", "Universidad Nacional", "Humanas", "Comedor Central");
        Usuario Helena = new Usuario("Helena", "Universidad Javeriana", "Ciencias", "Subway");
        Usuario Gabriel = new Usuario("Gabriel", "Universidad de Antioquia", "Humanas", "Comedor Central");
        Usuario Alicia = new Usuario("Alicia", "Universidad del Rosario", "Derecho", "Comedores de loto");
        Usuario Juliana = new Usuario("Juliana", "Universidad icesi", "Ingenieria", "Comedor Central");
        Usuario Carlos = new Usuario("Carlos", "Universidad del Norte", "Artes", "Le petit");
        Usuario Martin = new Usuario("Martin", "Universidad de la costa", "Humanas", "Comedor Sabroso");
        Usuario Olivia = new Usuario("Olivia", "Universidad Bolivariana", "Ciencias", "Comedor General");
        Usuario Santiago = new Usuario("Santiago", "Universidad Externado", "Ingenieria", "Comedor G");
        



        // Colas de usuarios activos
        colaUsuarios.offer(Alejandro);
        colaUsuarios.offer(Ana);
        colaUsuarios.offer(Ezequiel);
        colaUsuarios.offer(Camila);
        colaUsuarios.offer(Diego);
        colaUsuarios.offer(Mariana);
        colaUsuarios.offer(Beatriz);
        colaUsuarios.offer(David);
        colaUsuarios.offer(Claudia); 
        colaUsuarios.offer(Esteban);
        colaUsuarios.offer(Andrea);
        colaUsuarios.offer(Carolina); 
        colaUsuarios.offer(Andres);
        colaUsuarios.offer(Bruno);
        colaUsuarios.offer(Julia); 
        colaUsuarios.offer(Fernando);
        colaUsuarios.offer(Juan);
        colaUsuarios.offer(Erika);
        colaUsuarios.offer(Cecilia);
        colaUsuarios.offer(Adriana);
        colaUsuarios.offer(Leonardo);
        colaUsuarios.offer(Enrique);
        colaUsuarios.offer(Diana);
        colaUsuarios.offer(Maria);
        colaUsuarios.offer(Gonzalo);
        colaUsuarios.offer(Laura);


         // Imprimir la cola de usuarios
         System.out.println("Cola de usuarios:");
         for (Usuario usuario : colaUsuarios) {
             System.out.println(usuario);
         }
    }

     @Override
      public String toString() {
      return nombre;
    }

}


