import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Ejemplo_De_Cola {

    public static void main(String[] args) {

        //se crea la cola de clientes
        Queue<String> clientes = new LinkedList<>();

        clientes.offer("Carlos");
        clientes.offer("Maria");
        clientes.offer("Pedro");

        System.out.println("Clientes: " + clientes);

        System.out.println("Siguiente cliente: " + clientes.peek());

        System.out.println("Atendido: " + clientes.poll());

        System.out.println("Clientes pendientes: " + clientes.size());

        System.out.println("Esta vacia? " + clientes.isEmpty());

        System.out.println("Esta Pedro? " + clientes.contains("Pedro"));

        //se crea las lista para registrar a los clientes
        List<String> registro = new ArrayList<>();

        registro.add("Carlos");
        registro.add("Maria");
        registro.add("Pedro");

        System.out.println("Registro: " + registro);

        System.out.println("Cliente en posicion 0: " + registro.get(0));

        registro.set(1, "Mariana");

        System.out.println("Registro modificado: " + registro);

        System.out.println("Posicion de Pedro: " + registro.indexOf("Pedro"));

        registro.remove("Carlos");

        System.out.println("Registro actualizado: " + registro);

        while (!clientes.isEmpty()) {
            System.out.println("Atendido: " + clientes.poll());
        }

        System.out.println("Cola final: " + clientes);

        registro.clear();

        System.out.println("Registro final: " + registro);
    }
}