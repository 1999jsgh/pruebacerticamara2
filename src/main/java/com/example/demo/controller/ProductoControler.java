package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Ultis;
import com.example.demo.dto.ProductoDTO;
import com.example.demo.entidad.Producto;
import com.example.demo.repository.ProductoRepository;

@RestController
@RequestMapping(path = "/producto")
public class ProductoControler {

	@Autowired
	ProductoRepository productoRepository;

	@PostMapping("/registro")
	public Map<String, Object> create(@RequestBody ProductoDTO producto) {
		try {
			Producto u = new Producto(producto.getNombre(), producto.getValor());
			productoRepository.save(u);
			return Ultis.mapear(true, "Registro exitoso", null);
		} catch (Exception e) {
			return Ultis.mapear(true, "Error registro", null);
		}

	}
	
	@GetMapping("/traerProductos")
	public List<Producto>findAll(){
		return productoRepository.findAll();
		

	}
}
