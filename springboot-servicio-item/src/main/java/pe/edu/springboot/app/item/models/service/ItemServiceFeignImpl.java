package pe.edu.springboot.app.item.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import pe.edu.springboot.app.item.clientes.ProductoClienteRest;
import pe.edu.springboot.app.item.models.Item;

@Service
@Primary
public class ItemServiceFeignImpl implements ItemService{

	@Autowired
	private ProductoClienteRest productoClienteRest;
	
	@Override
	public List<Item> findAll() {
		return productoClienteRest.listar().stream().map(p -> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item(productoClienteRest.detalle(id),cantidad);
	}

}
