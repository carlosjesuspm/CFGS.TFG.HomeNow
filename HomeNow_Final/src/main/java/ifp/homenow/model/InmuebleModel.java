package ifp.homenow.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.InputStream;
import java.sql.Blob;
import java.util.ArrayList;



import ifp.homenow.bean.DireccionBean;
import ifp.homenow.bean.InmuebleBean;

import ifp.homenow.utility.JDBCDataSource;

public class InmuebleModel {

	public static long nextPk() {
		long pk = 0;
		Connection conn;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select Max(idinmuebles) from inmueble");
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

	public static long nextPkDireccion() {
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

	public static long addDireccionModel(DireccionBean direccion) {
		int i = 0;
		try {

			Connection conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("insert into direccion values(?,?,?,?,?,?,?,?)");
			stmt.setLong(1, nextPkDireccion());
			stmt.setString(2, direccion.getProvincia());
			stmt.setString(3, direccion.getMunicipio());
			stmt.setString(4, direccion.getLocalidad());
			stmt.setInt(5, direccion.getCodigo_postal());
			stmt.setString(6, direccion.getCalle());
			stmt.setInt(7, direccion.getNumero());
			stmt.setString(8, direccion.getComplemento());

			i = stmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public static long addInmuebleModel(InmuebleBean inmueble) {
		int i = 0;
		try {

			Connection conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("insert into inmueble values(?,?,?,?,?,?,?,?,?)");
			stmt.setLong(1, nextPk());
			stmt.setString(2, inmueble.getTipo());
			stmt.setInt(3, inmueble.getPrecio_inmueble());
			stmt.setInt(4, inmueble.getSuperficie());
			stmt.setLong(5, nextPk());
			stmt.setInt(6, inmueble.getHabitacion());
			stmt.setInt(7, inmueble.getBano());
			stmt.setString(8, inmueble.getDescripcion_inmueble());
			stmt.setBlob(9, inmueble.getImagen_inmueble());

			i = stmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public static ArrayList<InmuebleBean> listado() {
		ArrayList<InmuebleBean> listaInmuebles = new ArrayList<InmuebleBean>();
		ArrayList<DireccionBean> listaDireccion = new ArrayList<DireccionBean>();
		Connection conn = null;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("Select idinmuebles,\r\n"
					+ "tipo,\r\n"
					+ "precio_inmueble,\r\n"
					+ "superficie,\r\n"
					+ "direccion.provincia,\r\n"
					+ "direccion.municipio,\r\n"
					+ "direccion.localidad,\r\n"
					+ "direccion.codigo_postal,\r\n"
					+ "direccion.calle,\r\n"
					+ "direccion.numero,\r\n"
					+ "direccion.complemento,\r\n"
					+ "bano,\r\n"
					+ "habitacion,\r\n"
					+ "descripcion_inmueble,\r\n"
					+ "imagen_inmueble\r\n"
					+ "from inmueble Join direccion on idinmuebles=iddireccion;");
			
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				InmuebleBean inmueble = new InmuebleBean();
				DireccionBean direccion = new DireccionBean();
				
				inmueble.setIdinmuebles(rs.getLong("idinmuebles"));
				inmueble.setTipo(rs.getString("tipo"));
				inmueble.setPrecio_inmueble(rs.getInt("precio_inmueble"));
				inmueble.setSuperficie(rs.getInt("superficie"));
				inmueble.setDireccion_inmueble(direccion);
				inmueble.setHabitacion(rs.getInt("habitacion"));
				inmueble.setBano(rs.getInt("bano"));
				inmueble.setDescripcion_inmueble(rs.getString("descripcion_inmueble"));
				
				
				
				
				
				direccion.setProvincia(rs.getString("provincia"));
				direccion.setLocalidad(rs.getString("localidad"));
				direccion.setCalle(rs.getString("calle"));
				direccion.setComplemento(rs.getString("complemento"));
				direccion.setMunicipio(rs.getString("municipio"));
				direccion.setCodigo_postal(rs.getInt("codigo_postal"));
				direccion.setNumero(rs.getInt("numero"));
				
				
				listaDireccion.add(direccion);
				listaInmuebles.add(inmueble);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		return listaInmuebles;
	}

}
