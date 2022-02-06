package com.example.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Ultis;
import com.example.demo.dto.PagoDTO;
import com.example.demo.entidad.Pago;
import com.example.demo.entidad.Producto;
import com.example.demo.entidad.Usuario;
import com.example.demo.repository.PagoRepository;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.repository.UsuarioRepository;

@RestController
@RequestMapping(path = "/pago")
public class PagoControler {
	
	@Autowired
	ProductoRepository productoRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	PagoRepository pagoRepository;
	
	@PostMapping("/registro")
	public Map<String, Object> agregar(@RequestBody PagoDTO pagoDTO) {
		Optional<Usuario>usuario=usuarioRepository.findById(pagoDTO.getUsuario());
		Optional<Producto>producto=productoRepository.findById(pagoDTO.getProducto());
		
		long monto=pagoRepository.valor(usuario.get().getIdUsuario());
		long valor=Long.parseLong(producto.get().getValor());
		long valorFecha= pagoRepository.fecha(pagoDTO.getFecha());
		
		System.err.println("datoss---->"+valorFecha);
		if(usuario.isPresent()) {
			if(10000000>monto+valor) {
				if(5000000>monto+valorFecha) {
					Pago pago=new Pago(producto.get(),usuario.get(),pagoDTO.getCuotas(),pagoDTO.getFecha(),pagoDTO.getEstado());
					pagoRepository.save(pago);
					System.err.println("datoss---->"+pago);
					return Ultis.mapear(true, "Registro exitoso", pago);
				}else {
					return Ultis.mapear(false, "valor maximo por dia superado", null);
				}
				
			
			}else {
				return Ultis.mapear(false, "valor superado", null);
			}
	
			
		}
		
		return Ultis.mapear(false, "Registro Error", null);
		
	}
	
	@PostMapping(path = "/obtenerPagos/{id_usuario}")
	public Map<String, Object> mostrarAlquiler(@PathVariable int id_usuario) {
		List<Pago> listaAlquiler = pagoRepository.findById(id_usuario);

		return Ultis.mapear(true, "Alquileres realizados.", listaAlquiler);

	}

}
