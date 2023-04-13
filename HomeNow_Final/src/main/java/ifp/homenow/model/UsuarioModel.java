package ifp.homenow.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			PreparedStatement stmt = conn.prepareStatement("select Max(id) from user");
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
			PreparedStatement stmt = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?,?)");
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
}
