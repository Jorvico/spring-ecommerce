package com.jorge.ecommerce.Model;

public class Usuario {
	
	private Integer id;
	private String nombre;
	private String usarName;
	private String email;
	private String direccion;
	private String telefono;
	private String tipo;
	private String password;
	
	public Usuario() {
	
	}

	public Usuario(Integer id, String nombre, String usarName, String email, String direccion, String telefono,
			String tipo, String password) {
		this.id = id;
		this.nombre = nombre;
		this.usarName = usarName;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsarName() {
		return usarName;
	}

	public void setUsarName(String usarName) {
		this.usarName = usarName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", usarName=" + usarName + ", email=" + email
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", tipo=" + tipo + ", password=" + password
				+ "]";
	}
	
	
	
	
	
	
	
}
