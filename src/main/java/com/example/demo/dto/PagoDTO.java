package com.example.demo.dto;

public class PagoDTO {

	private int idPago;
	private int producto;
	private int usuario;
	private String cuotas;
	private String fecha;
	private int estado;
	
	
	public int getIdPago() {
		return idPago;
	}
	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}
	public int getProducto() {
		return producto;
	}
	public void setProducto(int producto) {
		this.producto = producto;
	}
	public int getUsuario() {
		return usuario;
	}
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	public String getCuotas() {
		return cuotas;
	}
	public void setCuotas(String cuotas) {
		this.cuotas = cuotas;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
