import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Licores_Lucy {

    public static void main(String[] args) {

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

        do {
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

            switch (opcion) {

                case 1:
                    System.out.println("\nProductos disponibles:");
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println((i + 1) + ". " + productos.get(i));
                    }

                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();
                    int indice = -1;

                    for (int i = 0; i < productos.size(); i++) {
                        if (productos.get(i).equalsIgnoreCase(nombre))
                            indice = i;
                        break;
                    }

                    if (indice != -1) {
                        compra.add(productos.get(indice));
                        System.out.println("Producto agregado.");
                    } else {
                        System.out.println("Producto no disponible.");
                    }
                    break;

                case 2:
                    if (compra.isEmpty()) {
                        System.out.println("La compra esta vacia.");
                    } else {
                        System.out.println("Productos comprados:");

                        for (int i = 0; i < compra.size(); i++) {
                            System.out.println((i + 1) + ". " + compra.get(i));
                        }

                        System.out.println("Cantidad de unidades: " + compra.size());
                        System.out.println("Contenido: " + compra.toString());
                    }
                    break;

                case 3:
                    System.out.print("Producto que desea buscar: ");
                    String buscar = sc.nextLine();

                    int primera = -1;
                    int ultima = -1;

                    for (int i = 0; i < compra.size(); i++) {
                        if (compra.get(i).equalsIgnoreCase(buscar)) {
                            if (primera == -1) {
                                primera = i;
                            }

                            ultima = i;
                        }
                    }

                    if (primera != -1) {
                        System.out.println("Primera posicion: " + (primera + 1));
                        System.out.println("Ultima posicion: " + (ultima + 1));
                        System.out.println("Cantidad del producto: "
                                + (ultima - primera + 1));
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    if (!compra.isEmpty()) {
                        for (int i = 0; i < compra.size(); i++) {
                            System.out.println((i + 1) + ". " + compra.get(i));
                        }

                        System.out.print("Numero del producto que eliminara: ");
                        int posicion = sc.nextInt();
                        sc.nextLine();

                        if (posicion > 0 && posicion <= compra.size()) {
                            System.out.println("Eliminado: "
                                    + compra.remove(posicion - 1));
                        } else {
                            System.out.println("Posicion invalida.");
                        }
                    } else {
                        System.out.println("No hay productos que eliminar.");
                    }
                    break;

                case 5:
                    compra.clear();
                    System.out.println("Compra cancelada.");
                    break;

                case 6:
                    if (!compra.isEmpty()) {
                        for (int i = 0; i < compra.size(); i++) {
                            System.out.println((i + 1) + ". " + compra.get(i));
                        }

                        System.out.print("Posicion que desea cambiar: ");
                        int posicion = sc.nextInt();
                        sc.nextLine();

                        if (posicion > 0 && posicion <= compra.size()) {
                            System.out.print("Nombre del nuevo producto: ");
                            String nuevo = sc.nextLine();
                            int encontrado = -1;

                            for (int i = 0; i < productos.size(); i++) {
                                if (productos.get(i).equalsIgnoreCase(nuevo)) {
                                    encontrado = i;
                                    break;
                                }
                            }

                            if (encontrado != -1) {
                                String anterior = compra.set(posicion - 1,
                                        productos.get(encontrado));

                                System.out.println("Se cambio " + anterior
                                        + " por " + productos.get(encontrado));
                            } else {
                                System.out.println("Producto no disponible.");
                            }
                        } else {
                            System.out.println("Posicion invalida.");
                        }
                    } else {
                        System.out.println("La compra esta vacia.");
                    }
                    break;

                case 7:
                    System.out.println("\n======= FACTURA LICORES LUCY =======");

                    if (compra.isEmpty()) {
                        System.out.println("No hay productos para facturar.");
                    } else {
                        for (int i = 0; i < compra.size(); i++) {
                            System.out.println((i + 1) + ". " + compra.get(i));
                        }

                        System.out.println("Total de unidades: " + compra.size());
                        System.out.println("Factura generada.");
                    }
                    break;

                case 8:
                    List<String> ordenados = new ArrayList<>(productos);
                    Collections.sort(ordenados);

                    System.out.println("\nCatalogo ordenado alfabeticamente:");

                    for (int i = 0; i < ordenados.size(); i++) {
                        System.out.println(ordenados.get(i));
                    }
                    break;

                case 9:
                    List<String> copia = new ArrayList<>(compra);

                    System.out.println("Copia de la compra: " + copia);
                    System.out.println("La compra es igual a la copia? "
                            + compra.equals(copia));
                    break;

                case 10:
                    System.out.print("Nombre del producto que desea insertar: ");
                    String insertar = sc.nextLine();

                    if (productos.contains(insertar)) {
                        System.out.print("Posicion donde desea insertarlo: ");
                        int lugar = sc.nextInt();
                        sc.nextLine();

                        if (lugar >= 1 && lugar <= compra.size() + 1) {
                            compra.add(lugar - 1, insertar);
                            System.out.println("Producto insertado.");
                        } else {
                            System.out.println("Posicion invalida.");
                        }
                    } else {
                        System.out.println("Producto no disponible.");
                    }
                    break;

            }

        } while (opcion != 9);
    }
}
