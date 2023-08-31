package entities;

import java.util.HashMap;

public class Tienda {
    private int id;
    private HashMap<Integer, Producto> listaProductos;
    private String direccion;
    private String representante;

    public Tienda() {
    }

    public Tienda(int id, HashMap<Integer, Producto> listaProductos, String direccion, String representante) {
        this.id = id;
        this.listaProductos = listaProductos;
        this.direccion = direccion;
        this.representante = representante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(HashMap<Integer, Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "Tienda{" + "id=" + id + ", listaProductos=" + listaProductos + ", direccion=" + direccion + ", representante=" + representante + '}';
    }
    
    
}
