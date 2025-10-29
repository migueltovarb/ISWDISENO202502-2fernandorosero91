package inventarioSupermercado;

import java.util.Scanner;

public class InventarioSupermercado {
    static final int MAX_PRODUCTOS = 5;
    static String[] nombres = new String[MAX_PRODUCTOS];
    static int[] cantidades = new int[MAX_PRODUCTOS];
    static int totalInventario = 0;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ingreso de productos ----------------------------------------------------- 
        for (int i = 0; i < MAX_PRODUCTOS; i++) {
            String nombre;
            do {
                System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
                nombre = entrada.nextLine().trim();
                if (nombre.isEmpty()) {
                    System.out.println("El nombre no puede estar vacío.");
                }
            } while (nombre.isEmpty());
            nombres[i] = nombre;

            int cantidad;
            do {
                System.out.print("Ingrese la cantidad en inventario: ");
                if (entrada.hasNextInt()) {
                    cantidad = entrada.nextInt();
                    if (cantidad < 0) {
                        System.out.println("La cantidad no puede ser negativa.");
                    }
                } else {
                    System.out.println("Debe ingresar un número entero.");
                    entrada.next(); 
                    cantidad = -1;
                }
            } while (cantidad < 0);
            entrada.nextLine(); 
            cantidades[i] = cantidad;
            totalInventario += cantidad;
        }
        //---------------------------------------------------------------------------------

        int opcion;
        int repeticiones = 0;

        do {
            // Menú
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mostrar todos los productos y sus existencias");
            System.out.println("2. Buscar un producto por nombre y ver su cantidad");
            System.out.println("3. Actualizar el inventario");
            System.out.println("4. Generar alerta de productos con cantidad menor a 10");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();
                entrada.nextLine();
            } else {
                System.out.println("Debe ingresar un número entre 1 y 5.");
                entrada.next(); 
                opcion = -1;
            }

            if (opcion == 1) {
                for (int i = 0; i < MAX_PRODUCTOS; i++) {
                    System.out.println(nombres[i] + ": " + cantidades[i] + " unidades");
                }
                System.out.println("Total en inventario: " + totalInventario + " unidades");
            } else if (opcion == 2) {
                System.out.print("Ingrese el nombre del producto a buscar: ");
                String nombreBuscado = entrada.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < MAX_PRODUCTOS; i++) {
                    if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                        System.out.println(nombres[i] + " tiene " + cantidades[i] + " unidades.");
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 3) {
                System.out.print("Ingrese el nombre del producto a actualizar: ");
                String nombreActualizar = entrada.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < MAX_PRODUCTOS; i++) {
                    if (nombres[i].equalsIgnoreCase(nombreActualizar)) {
                        System.out.print("Ingrese la cantidad a agregar (+) o quitar (-): ");
                        if (entrada.hasNextInt()) {
                            int cambio = entrada.nextInt();
                            entrada.nextLine();
                            if (cantidades[i] + cambio < 0) {
                                System.out.println("Error: no puede quedar con cantidad negativa.");
                            } else {
                                cantidades[i] += cambio;
                                totalInventario += cambio;
                                System.out.println("Inventario actualizado.");
                            }
                        } else {
                            System.out.println("Debe ingresar un número entero.");
                            entrada.next(); 
                        }
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 4) {
                System.out.println("Productos con menos de 10 unidades:");
                boolean hayAlertas = false;
                for (int i = 0; i < MAX_PRODUCTOS; i++) {
                    if (cantidades[i] < 10) {
                        System.out.println(nombres[i] + ": " + cantidades[i] + " unidades");
                        hayAlertas = true;
                    }
                }
                if (!hayAlertas) {
                    System.out.println("Todos los productos tienen suficiente stock.");
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opción no válida.");
            }

            repeticiones++;
        } while (opcion != 5 && repeticiones < 3);
    }
}
