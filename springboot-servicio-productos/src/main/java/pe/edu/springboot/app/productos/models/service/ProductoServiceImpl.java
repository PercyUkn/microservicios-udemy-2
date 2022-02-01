package pe.edu.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.springboot.app.productos.models.dao.IProductoDao;
import pe.edu.springboot.app.productos.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{

	
	@Autowired
	private IProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null); // Devuelve el producto si lo encuentra, de lo contrario devuelve null
	}

}
