package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class Gestiones extends Producto {
	List<Producto> produc=new ArrayList<>();
	
//	Programa para gestión de productos.
//
//	Cada producto tendrá: nombre, precio, categoria
//
//	La lógica de negocio, expondrá los siguientes métodos:
//
//	-eliminarPorCategoria: elimina de la lista aquellos productos que pertenezcan a la categoría indicada
//
//	-bajarPrecio: Baja el precio de todos productos en el porcentaje indicado
//
//	-subirPrecioCategoria: Sube el precio a todos los productos de la categoría indicada, en el porcentaje indicado
//
//	-obtenerProductos: Devuelve la lista de productos existentes
//	-agregarProducto: Añade el producto recibido 
	
	public void eliminarPorCategoria (String categoria) {
		produc.removeIf(n->n.getCategoria().equals(categoria));
		
	}
	
	public void bajarPrecio (int porcentaje) {
		produc.forEach(n->n.setPrecio(n.getPrecio()*((100-porcentaje)/100)));
	
	}
	
	public void subirPrecioCategoria (int porcentaje, String categoria) {
		produc.replaceAll(n->{
			if(categoria.equals(n.getCategoria())) {
				n.setPrecio(n.getPrecio()*((100+porcentaje)/100));
			}
			return n;
		});
		
	}
	
	public List<Producto> listadoProducto (){
		return produc;
		
	}
	
	public void agregarProducto (Producto producto){
		produc.add(producto);
		
	}
	
	public void ordenarPorPrecio (Producto producto) {
		produc.sort((a,b)->(Double.compare(a.getPrecio(), b.getPrecio())));
	}

}
