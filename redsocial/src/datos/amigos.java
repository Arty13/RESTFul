package datos;

public class amigos {

	private int idamigos;
	private String usuario_idusuario;
	private String usuario_idusuario1;
	private int estado;

	public amigos(int idamigos, String usuario_idusuario, String usuario_idusuario1, int estado) {
		this.idamigos = idamigos;
		this.usuario_idusuario = usuario_idusuario;
		this.usuario_idusuario1 = usuario_idusuario1;
		this.estado = estado;
	}

	public int getIdamigos() {
		return idamigos;
	}

	public void setIdamigos(int idamigos) {
		this.idamigos = idamigos;
	}

	public String getUsuario_idusuario() {
		return usuario_idusuario;
	}

	public void setUsuario_idusuario(String usuario_idusuario) {
		this.usuario_idusuario = usuario_idusuario;
	}

	public String getUsuario_idusuario1() {
		return usuario_idusuario1;
	}

	public void setUsuario_idusuario1(String usuario_idusuario1) {
		this.usuario_idusuario1 = usuario_idusuario1;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
