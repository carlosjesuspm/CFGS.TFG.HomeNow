package ifp.homenow.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ifp.homenow.bean.HabitacionBean;
import ifp.homenow.utility.JDBCDataSource;

public class HabitacionModel {

	public static long nextPk() {
		long pk = 0;
		Connection conn;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select Max(idhabitacion) from habitacion");
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
	
	public static long addDireccion(HabitacionBean hab) {
		int i = 0;
		try {
			
			Connection conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("insert into habitacion values(?,?,?,?,?,?,?)");
			stmt.setLong(1, nextPk());
			stmt.setInt(2, hab.getPrecio_hab());
			stmt.setLong(3, hab.getDireccion_hab());
			stmt.setInt(4, hab.getCompaneros());
			stmt.setString(5, hab.getImagenes_hab());
			stmt.setString(6, hab.getDescripcion_hab());
			stmt.setLong(7, hab.getUsuarios_hab());
			

			i = stmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}
}
