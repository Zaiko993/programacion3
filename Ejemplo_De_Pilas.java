import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Ejemplo_De_Pila {

    public static void main(String[] args) {

        //se crean las pilas de platos sucios y limpios
        Stack<String> platosSucios = new Stack<>();
        Stack<String> platosLimpios = new Stack<>();

        //se crean las listas para registrar los platos
        List<String> registroSucios = new ArrayList<>();
        List<String> registroLimpios = new ArrayList<>();

        platosSucios.push("Plato 1");
        platosSucios.push("Plato 2");
        platosSucios.push("Plato 3");

        registroSucios.add("Plato 1");
        registroSucios.add("Plato 2");
        registroSucios.add("Plato 3");

        System.out.println("Platos sucios: " + platosSucios);

        System.out.println("Ultimo plato: " + platosSucios.peek());

        System.out.println("Sacar plato: " + platosSucios.pop());

        System.out.println("Cantidad de platos sucios: " + platosSucios.size());

        System.out.println("Esta vacia? " + platosSucios.isEmpty());

        System.out.println("Posicion del plato: " + platosSucios.search("Plato 1"));

        System.out.println("Existe el plato? " + platosSucios.contains("Plato 2"));


        System.out.println("Primer plato del registro: " + registroSucios.get(0));

        registroSucios.set(1, "Plato 4");

        System.out.println("Registro modificado: " + registroSucios);

        System.out.println("Posicion del Plato 3: " + registroSucios.indexOf("Plato 3"));

        registroSucios.remove("Plato 1");

        System.out.println("Registro actualizado: " + registroSucios);

        while (!platosSucios.isEmpty()) {
            String plato = platosSucios.pop();
            platosLimpios.push(plato);
            registroLimpios.add(plato);
        }

        System.out.println("Platos limpios: " + platosLimpios);

        System.out.println("Ultimo plato limpio: " + platosLimpios.peek());

        System.out.println("Cantidad de platos limpios: " + platosLimpios.size());

        System.out.println("Existe Plato 2? " + platosLimpios.contains("Plato 2"));

        System.out.println("Pila de platos sucios: " + platosSucios);

        System.out.println("Pila de platos limpios: " + platosLimpios);

        registroSucios.clear();

        System.out.println("Registro de sucios: " + registroSucios);

        System.out.println("Pila vacia? " + platosSucios.empty());
    }
}