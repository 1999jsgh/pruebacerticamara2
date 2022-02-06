package com.example.demo.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private int idUsuario;
	
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String numTarjeta;
	private String fechaVencimiento;

	

	public Usuario( String nombre, String apellido, String telefono, String correo, String numTarjeta,
			String fechaVencimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.numTarjeta = numTarjeta;
		this.fechaVencimiento = fechaVencimiento;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", correo=" + correo + ", numTarjeta=" + numTarjeta + ", fechaVencimiento="
				+ fechaVencimiento + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




}
