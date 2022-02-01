package pe.edu.springboot.app.productos.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.springboot.app.productos.models.entity.Producto;

public interface IProductoDao extends JpaRepository<Producto, Long>{

}
