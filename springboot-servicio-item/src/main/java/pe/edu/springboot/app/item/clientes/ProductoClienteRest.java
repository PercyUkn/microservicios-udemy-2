package pe.edu.springboot.app.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pe.edu.springboot.app.item.models.Producto;

@FeignClient(name = "servicio-productos", url="localhost:8001")// Nombre del microservicio con el que se va a comunicar
public interface ProductoClienteRest {

	@GetMapping("/listar") // Endpoint para consumir el producto
	public List<Producto> listar();
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable() Long id);
	
}
