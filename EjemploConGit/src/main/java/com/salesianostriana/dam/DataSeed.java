package com.salesianostriana.dam;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataSeed {
	
	private final ProductoRepository productoRepository;
	
	@PostConstruct
	public void init() {
		
		productoRepository.save(
				Producto.builder()
				.nombre("Bocata de jamón ibérico")
				.precio(2.95)
				.build()
				);
		
	}

}
