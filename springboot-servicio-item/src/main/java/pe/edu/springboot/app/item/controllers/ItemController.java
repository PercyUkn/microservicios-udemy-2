package pe.edu.springboot.app.item.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.springboot.app.item.models.Item;
import pe.edu.springboot.app.item.models.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/listar")
	public List<Item> listar(){
		return itemService.findAll().stream().map(item -> {item.setPort_item(port); return item;}).collect(Collectors.toList());
	}

	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		Item item = itemService.findById(id, cantidad);
		item.setPort_item(port);
		return item;
	}
	
}
