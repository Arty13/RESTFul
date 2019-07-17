package datos;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.apache.naming.NamingContext;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/holamundo")
public class holamundo {
	
	
	private DataSource ds;
	private Connection conn;

	public holamundo() {
		InitialContext ctx;
		try {
			ctx = new InitialContext();
			NamingContext envCtx = (NamingContext) ctx.lookup("java:comp/env");

			ds = (DataSource) envCtx.lookup("jdbc/redsocial");
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		System.out.println("holaaaaaaaaaaa");
		return "Hello Jersey1";
		}
	
	
	/*@GET
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello() {
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	  }*/
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(@QueryParam("id") @DefaultValue("Jersey") String id) {
	  return "<?xml version=\"1.0\"?>" + "<hello> Hello " + id + "</hello>";
	}
}
