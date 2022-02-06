package com.example.demo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pago")
public class Pago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPago")
	private int idPago;
	
	@ManyToOne
	@JoinColumn(name="idProducto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	
	private String cuotas;
	private String fecha;
	private int estado;
	
	public Pago(Producto producto, Usuario usuario, String cuotas, String fecha, int estado) {
		super();
		this.producto = producto;
		this.usuario = usuario;
		this.cuotas = cuotas;
		this.fecha = fecha;
		this.estado = estado;
	}

	public Pago() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getIdPago() {
		return idPago;
	}
	public void setIdPago(int idPago) {
		this.idPago = idPago;
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
	@Override
	public String toString() {
		return "Pago [producto=" + producto + ", usuario=" + usuario + ", cuotas=" + cuotas
				+ ", fecha=" + fecha + ", estado=" + estado + "]";
	}
	
	

	
}
