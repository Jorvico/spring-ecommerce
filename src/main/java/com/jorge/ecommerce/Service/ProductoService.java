package com.jorge.ecommerce.Service;

import java.util.Optional;

import com.jorge.ecommerce.Model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	
	
}
