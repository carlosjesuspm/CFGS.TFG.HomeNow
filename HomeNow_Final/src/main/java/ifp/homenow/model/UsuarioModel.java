package ifp.homenow.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ifp.homenow.bean.UsuarioBean;
import ifp.homenow.utility.JDBCDataSource;

/*Esta clase comprende todas las gestiones realizadas
 * a la clase usuario en la bbdd
 */
public class UsuarioModel {

	public static long nextPk() {
		long pk = 0;
		Connection conn;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select Max(idusuarios) from usuarios");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				pk = rs.getLong(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pk + 1;

	}

	public static long addUser(UsuarioBean user) {
		int i = 0;
		try {

			Connection conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("insert into usuarios values(?,?,?,?,?,?,?,?,?,?)");
			stmt.setLong(1, nextPk());
			stmt.setString(2, user.getNombre());
			stmt.setString(3, user.getApellido1());
			stmt.setString(4, user.getApellido2());
			stmt.setDate(5, new java.sql.Date(user.getFecha_nacimiento().getTime()));
			stmt.setInt(6, user.getEdad());
			stmt.setString(7, user.getUsuario());
			stmt.setString(8, user.getContrasena());
			stmt.setInt(9, user.getTelefono());
			stmt.setString(10, user.getCorreo());

			i = stmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public static UsuarioBean UserLogin(String usuario, String contrasena) {
		Connection con;
		UsuarioBean user = null;
		try {
			con = JDBCDataSource.getConnection();
			PreparedStatement stmt = con.prepareStatement("Select * from usuarios where usuario=? and contrasena = ?");
			stmt.setString(1, usuario);
			stmt.setString(2, contrasena);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				user = new UsuarioBean();
				user.setIdusuarios(rs.getLong("idusuarios"));
				user.setNombre(rs.getString("nombre"));
				user.setApellido1(rs.getString("apellido1"));
				user.setApellido2(rs.getString("apellido2"));
				user.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
				user.setEdad(rs.getInt("edad"));
				user.setUsuario(rs.getString("usuario"));
				user.setContrasena(rs.getString("contrasena"));
				user.setTelefono(rs.getInt("telefono"));
				user.setCorreo(rs.getString("correo"));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}
	
	public static UsuarioBean obtenerUsuario(Long idusuarios) throws SQLException {
		Connection con;
		UsuarioBean user = null;
		try {
			con = JDBCDataSource.getConnection();
			PreparedStatement stmt = con.prepareStatement("Select * from usuarios where idusuarios=? limit 1");
			stmt.setLong(1, idusuarios);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				user = new UsuarioBean();
				user.setIdusuarios(rs.getLong("idusuarios"));
				user.setNombre(rs.getString("nombre"));
				user.setApellido1(rs.getString("apellido1"));
				user.setApellido2(rs.getString("apellido2"));
				user.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
				user.setEdad(rs.getInt("edad"));
				user.setUsuario(rs.getString("usuario"));
				user.setContrasena(rs.getString("contrasena"));
				user.setTelefono(rs.getInt("telefono"));
				user.setCorreo(rs.getString("correo"));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	
    }
	
	
}
