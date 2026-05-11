package com.salesianostriana.dam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/producto/")
@RequiredArgsConstructor
public class ProductoControlador {
	
	private final ProductoServicio productoServicio;
	
	@GetMapping
	private String listar(Model model) {
		model.addAttribute("productos", productoServicio.listar());
		return "index";
	}
	

}
