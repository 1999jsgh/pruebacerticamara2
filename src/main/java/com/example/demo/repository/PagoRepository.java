package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entidad.Pago;



public interface PagoRepository extends JpaRepository<Pago, Integer>{

	@Query(nativeQuery = true,value = " SELECT * FROM `pago` WHERE id_usuario=?")
    List<Pago> findById(int id_usuario);
	
	@Query(nativeQuery = true,value = " SELECT SUM(producto.valor) FROM pago INNER JOIN producto ON pago.id_producto = producto.id_producto WHERE pago.id_usuario = ?")
    long valor(long valor);
	
	@Query(nativeQuery = true,value = "SELECT SUM(producto.valor)FROM pago INNER JOIN producto ON pago.id_producto = producto.id_producto WHERE pago.fecha =?")
	long fecha(String fecha);
}
