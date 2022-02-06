package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Ultis;
import com.example.demo.dto.UsuarioDTO;
import com.example.demo.entidad.Usuario;
import com.example.demo.repository.UsuarioRepository;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioControler {
	

	@Autowired
	 UsuarioRepository usuarioRepository;
	
	@PostMapping("/registro")
	public Map<String, Object> create(@RequestBody UsuarioDTO usuario) {
		try {
			Usuario u =new Usuario(usuario.getNombre(),usuario.getApellido(),usuario.getTelefono(),usuario.getCorreo(),usuario.getNumTarjeta(),usuario.getFechaVencimiento());
			usuarioRepository.save(u);
			return Ultis.mapear(true, "Registro exitoso", null);
		} catch (Exception e) {
			return Ultis.mapear(true, "Error registro", null);
}
		
		
	}

}
