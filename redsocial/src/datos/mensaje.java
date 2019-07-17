package datos;

import java.sql.Date;

public class mensaje {

	private int idmensaje;
	private Date fecha;
	private String mensaje;
	private String usuario_idusuario;
	
	public mensaje(int idmensaje, Date fecha, String mensaje, String usuario_idusuario) {
		this.idmensaje = idmensaje;
		this.fecha = fecha;
		this.mensaje = mensaje;
		this.usuario_idusuario = usuario_idusuario;
	}

	public int getIdmensaje() {
		return idmensaje;
	}

	public void setIdmensaje(int idmensaje) {
		this.idmensaje = idmensaje;
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
	
}
