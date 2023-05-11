package ifp.homenow.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ifp.homenow.bean.ImagenBean;
import ifp.homenow.utility.JDBCDataSource;

public class ImagenModel {

	public static long nextPk() {
		long pk = 0;
		Connection conn;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select Max(idimagen) from imagenes");
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

	public static long addImagen(ImagenBean imagen) {

		int i = 0;
		
		try {
			Connection conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("insert into imagenes values(?,?)");
			
			stmt.setLong(1, nextPk());
			stmt.setBlob(2, imagen.getImagen());
			
			i = stmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		return i;
	}
}
