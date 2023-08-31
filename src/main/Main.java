package main;

import Services.TiendaServicio;
import java.util.Scanner;

/*
Una vez realizado el programa:
- Crear 3 tiendas.
- Crear 15 productos
- Asociar a cada tienda, 5 productos de los creados. (algunos productos pueden repetirse, pero no todos)
La lista de productos son su entidad de por si? cada lista dentro del atributo de tienda
- Agregar cantidad de stock de cada producto a la tienda
- Realizar algunas ventas
- Calcular el stock restante.
Nota: Agregar o modificar funciones para que se realice correctamente lo que se pide. (Por ejemplo; No se
puede vender cierto producto si es que no hay stock.)
*/

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TiendaServicio ts = new TiendaServicio();
        int cantTiendas;
        
        System.out.println("Ingrese la cantidad de tiendas de la cadena");
        cantTiendas = leer.nextInt();

        for (int j = 0; j < cantTiendas; j++) {
            ts.crearTienda(j);
        }

    }
    
    /*
    do {
            System.out.println("Bienvenido al Menu, seleccione una opcion;\n"
                    + "1. Introducir un Elemento \n"
                    + "2. Modificar precio\n"
                    + "3. Eliminar Producto\n"
                    + "4. Mostrar Productos\n"
                    + "5. Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    agregarProductos();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Valor no valido");
            }
        } while (opcion != 5);
    */

}
