import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Licores_Lucy {

    public static void main(String[] args){
    
        List<String> compra = new ArrayList<>();
        List<String> productos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        productos.add("Cerveza Poker");
        productos.add("Cerveza Aguila Light");
        productos.add("Cerveza Costeña Bacana");
        productos.add("Cerveza Costeña");
        productos.add("Cerveza Red");
        productos.add("Cerveza Corona");
        productos.add("Cerveza Aguila Cero");

        int opcion = 0;

         do
        {
            System.out.println("\n========== LICORES LUCY ==========");
            System.out.print("\n1. Agregar producto a la compra"
                    + "\n2. Ver compra actual"
                    + "\n3. Buscar producto en la compra"
                    + "\n4. Eliminar producto"
                    + "\n5. Cancelar compra"
                    + "\n6. Cambiar producto"
                    + "\n7. Generar factura"
                    + "\n8. Ver catalogo de productos"
                    + "\n9. Salir"
                    + "\nSeleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
    
                case 1:
                    System.out.println("\nProductos disponibles:");

                    for (int i = 0; i < productos.size(); i++){
                        System.out.println((i + 1) + ". " + productos.get(i));
                    }

                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();
                    int indice = -1;

                    for (int i = 0; i < productos.size(); i++){
                        if (productos.get(i).equalsIgnoreCase(nombre))
                            indice = i;
                            break;}

                    if (indice != -1){
                        compra.add(productos.get(indice));
                        System.out.println("Producto agregado.");}
                    else{
                        System.out.println("Producto no disponible.");}
                    break;
            }
            
        } while (opcion != 9);
    }
}
