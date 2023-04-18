package ifp.homenow.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ifp.homenow.bean.DetalleAlquilerBean;
import ifp.homenow.utility.JDBCDataSource;

public class DetalleAlquilerModel {

	
	public static long nextPk() {
		long pk = 0;
		Connection conn;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select Max(iddetalle_alquiler) from detalle_alquiler");
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
	
	public static long addDetalleAlquiler(DetalleAlquilerBean detalleAlquiler) {
		int i = 0;
		try {
			
			Connection conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("insert into detalle_alquiler values(?,?,?,?,?,?)");
			stmt.setLong(1, nextPk());
			stmt.setDate(2, new java.sql.Date(detalleAlquiler.getFecha_inicio_alquiler().getTime()));
			stmt.setDate(3, new java.sql.Date(detalleAlquiler.getFecha_fin_alquiler().getTime()));
			stmt.setInt(4, detalleAlquiler.getFianza());
			stmt.setLong(5, detalleAlquiler.getInmueble_alq());
			stmt.setLong(6, detalleAlquiler.getUsuarios_alq());
			
			i = stmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}
}
