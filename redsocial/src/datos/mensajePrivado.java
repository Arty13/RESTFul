package datos;

import java.sql.Date;

public class mensajePrivado {

	private int idmensajePrivado;
	private Date fecha;
	private String mensaje;
	private String usuario_idusuario;
	private String usuario_idusuario1;

	public mensajePrivado(int idmensajePrivado, Date fecha, String mensaje, String usuario_idusuario,
			String usuario_idusuario1) {
		this.idmensajePrivado = idmensajePrivado;
		this.fecha = fecha;
		this.mensaje = mensaje;
		this.usuario_idusuario = usuario_idusuario;
		this.usuario_idusuario1 = usuario_idusuario1;
	}

	public int getIdmensajePrivado() {
		return idmensajePrivado;
	}

	public void setIdmensajePrivado(int idmensajePrivado) {
		this.idmensajePrivado = idmensajePrivado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
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

}
