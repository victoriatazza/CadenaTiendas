package Services;

import entities.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
        Además:
        AgregarProductos(): Agrega el producto elegido y la cantidad.
        VenderProductos(): Vende cierta cantidad del producto.
        EliminarProductos(): Elimina el Producto de esa tienda.
        StockProductos(): Nos devuelve cuantos productos hay
 */
public class TiendaServicio {

    Scanner leer;
    ProductoServicio ps;
    HashMap<Integer, Tienda> listaTiendas;

    public TiendaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.ps = new ProductoServicio();
    }

    // CrearTienda() <-- crea listaProductos
    public void crearTienda(int j) {
        Tienda tienda = new Tienda();

        int cantProductos;
        System.out.println("Cuantos productos");
        cantProductos = leer.nextInt();

        tienda.setId(j);
        // No seteamos la lista entera, de la lista tenemos que tomar X cant productos
        // Para tomar esos productos, recorremos la lista, creamos una nueva, y tomamos indices random

        // ps.crearLista()
        
        // tomamos la lista original (15), y con esa lista, creamos otras nuevas (5)
        
        // 5 productos
        for (int i = 0; i < cantProductos; i++) {
            // asignar 5 productos, tomando el indice con (Math.random()*cantProductos+1);
        }
//        tienda.setListaProductos();

        System.out.println("Ingrese la direccion");
        tienda.setDireccion(leer.next());
        System.out.println("Ingrese representante");
        tienda.setRepresentante(leer.next());
    }

    public void mostrarTiendas() {
        for (Map.Entry<Integer, Tienda> entry : listaTiendas.entrySet()) {
            System.out.println("ID ; " + entry.getKey() + "\nInfo Tienda; " + entry.getValue());
        }
    }

    public void modificarTienda() {
        int idIngresado;
//        double newPrecio;
//        String newNombre;

        System.out.println("Cual producto quiere modificar, ingrese el ID");
        idIngresado = leer.nextInt();

        // NUEVOS ATRIBUTOS
//        System.out.println("Ingrese nuevo nombre");
//        newNombre = leer.next();
//        System.out.println("Ingrese nuevo precio");
//        newPrecio = leer.nextDouble();
//        listaTiendas.replace(idIngresado, new Tienda(newNombre, newPrecio));
    }

    public void eliminarTienda() {
        System.out.println("Cual tienda quiere eliminar, ingrese el ID");
        listaTiendas.remove(leer.nextInt());
    }

}
