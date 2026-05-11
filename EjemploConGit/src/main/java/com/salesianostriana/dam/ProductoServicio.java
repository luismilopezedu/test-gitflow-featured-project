package com.salesianostriana.dam;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoServicio {
	
	private final ProductoRepository productoRepository;
	
	
	public Producto nuevo(Producto producto) {
		return productoRepository.save(producto);
	}
	
	public List<Producto> listar() {
		return productoRepository.findAll();
	}

}
