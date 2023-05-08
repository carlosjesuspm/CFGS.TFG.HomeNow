package ifp.homenow.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import ifp.homenow.bean.DireccionBean;
import ifp.homenow.bean.InmuebleBean;
import ifp.homenow.bean.UsuarioBean;
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

	public static long addInmuebleModel(InmuebleBean inmueble, HttpSession session) {
		int i = 0;
		try {

			Connection conn = JDBCDataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("insert into inmueble values(?,?,?,?,?,?,?,?,?,?)");
			stmt.setLong(1, nextPk());
			stmt.setString(2, inmueble.getTipo());
			stmt.setInt(3, inmueble.getPrecio_inmueble());
			stmt.setInt(4, inmueble.getSuperficie());
			stmt.setLong(5, nextPk());
			stmt.setInt(6, inmueble.getHabitacion());
			stmt.setInt(7, inmueble.getBano());
			stmt.setString(8, inmueble.getDescripcion_inmueble());
			stmt.setLong(9, (Long) session.getAttribute("userId"));
			stmt.setBlob(10, inmueble.getImagenes_inmueble());
			

			i = stmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	/*
	 * public static List listaInmuebles() {
	 * 
	 * 
	 * ArrayList<InmuebleBean> listaInmuebles =new ArrayList<InmuebleBean>();
	 * Connection conn=null; try { conn=JDBCDataSource.getConnection();
	 * PreparedStatement pstmt=conn.prepareStatement("Select * from inmueble");
	 * ResultSet rs= pstmt.executeQuery(); while(rs.next()) { InmuebleBean inmueble=
	 * new InmuebleBean(); inmueble.setIdinmuebles(rs.getLong("idinmuebles")); }
	 * }catch(Exception e) { e.printStackTrace(); } finally {
	 * JDBCDataSource.closeConnection(conn); } return listaInmuebles;
	 * 
	 * 
	 * }
	 */
}
