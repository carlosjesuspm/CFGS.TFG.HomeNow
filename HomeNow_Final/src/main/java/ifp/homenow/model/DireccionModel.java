package ifp.homenow.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ifp.homenow.bean.DireccionBean;
import ifp.homenow.utility.JDBCDataSource;

public class DireccionModel {

	public static long nextPk() {
		long pk = 0;
		Connection conn;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select Max(iddireccion) from direccion");
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
	
	public static long addDireccion(DireccionBean direccion) {
		int i = 0;
		try {
			
			Connection conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("insert into direccion values(?,?,?,?,?,?,?)");
			stmt.setLong(1, nextPk());
			stmt.setString(2, direccion.getProvincia());
			stmt.setString(3, direccion.getMunicipio());
			stmt.setString(4, direccion.getLocalidad());
			stmt.setInt(5, direccion.getCodigo_postal());
			stmt.setInt(6, direccion.getNumero());
			stmt.setString(7, direccion.getComplemento());

			i = stmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}
}
