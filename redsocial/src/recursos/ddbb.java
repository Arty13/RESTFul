package recursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ddbb {

	private String drv = "com.mysql.jdbc.Driver";
	private String user = "root";
	private String pass = "restuser";
	private String url = "jdbc:mysql://localhost:3306/redsocial";
	private Connection conn;
	
	public Connection getConn() {
		return this.conn;
	}
	
	public void conectar() {
		try {
			Class.forName(this.drv);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		boolean noConectado = false;
		try {
			this.conn = DriverManager.getConnection(this.url, this.user, this.pass);
			System.out.println("Conectado a la base de datos \n");
		} catch (SQLException e) {
			noConectado = true;
		} catch (Exception e) {
			noConectado = true;
		}
		if (noConectado) {
			try {
				this.conn = DriverManager.getConnection(this.url, this.user, this.pass);
			} catch (SQLException e1) {
				System.out.println(e1);
			} catch (Exception e) {
				System.out.println("Error al conectar con la BBDD \n");
			}
		}
		
	}
	
	private void estaConectado() throws SQLException {
		if (this.conn == null) {
			conectar();
		} else {
			System.out.println("conectado");
		}
	}
	
	private void desconectar() throws SQLException {
		this.conn.close();
	}
	public static void main(String[] args) throws SQLException {
		ddbb prueba = new ddbb ();
		prueba.conectar();
		prueba.estaConectado();
		prueba.desconectar();

	}

}
