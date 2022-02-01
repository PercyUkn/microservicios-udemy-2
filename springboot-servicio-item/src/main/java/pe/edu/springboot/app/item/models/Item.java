package pe.edu.springboot.app.item.models;

import lombok.Data;

@Data
public class Item {

	private Producto producto;
	private Integer cantidad;

	public Item() {}

	public Item(Producto producto, Integer cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public Double getTotal() {
		return producto.getPrecio() * this.cantidad.doubleValue();
	}
	
	
}
