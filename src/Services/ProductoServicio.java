package Services;

import entities.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    Scanner leer;
    HashMap<Integer, Producto> listaProductos;

    public ProductoServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaProductos = new HashMap();
    }

    public HashMap<Integer, Producto> crearLista() {
        int cantProductos;
        System.out.println("Cuantos productos");
        cantProductos = leer.nextInt();
        for (int i = 0; i < cantProductos; i++) {
            listaProductos.put(i, crearProducto(i));
        }
        return listaProductos;
    }

    public Producto crearProducto(int i) {
        Producto produ = new Producto();
        System.out.println("Producto " + i);
        produ.setId(i);
        System.out.println("Ingrese el nombre del producto");
        produ.setNombre(leer.next());
        System.out.println("Ingrese el precio del producto");
        produ.setPrecio(leer.nextDouble());
        return produ;
    }

    public void mostrarProductos() {
        for (Map.Entry<Integer, Producto> entry : listaProductos.entrySet()) {
            System.out.println("ID ; " + entry.getKey() + "\nInfo Producto; " + entry.getValue());
        }
    }

    public void modificarProducto() {
        int idIngresado;
        double newPrecio;
        String newNombre;

        System.out.println("Cual producto quiere modificar, ingrese el ID");
        idIngresado = leer.nextInt();

        System.out.println("Ingrese nuevo nombre");
        newNombre = leer.next();
        System.out.println("Ingrese nuevo precio");
        newPrecio = leer.nextDouble();

        listaProductos.replace(idIngresado, new Producto(newNombre, newPrecio));
    }

    public void eliminarProducto() {
        System.out.println("Cual producto quiere eliminar, ingrese el ID");
        listaProductos.remove(leer.nextInt());
    }
}
