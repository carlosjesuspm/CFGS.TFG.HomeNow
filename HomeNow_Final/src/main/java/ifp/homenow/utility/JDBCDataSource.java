package ifp.homenow.utility;

import java.sql.Connection;
import java.util.ResourceBundle;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/*Interface que hereda de CommonDataSource y WrapperClass. Contiene dos métodos como 
 * getConnection() y getConnection(String username, String password). Se emplea como 
 * alternativa al clásico DriverManager, permitiendo establecer um pool connection.
 */

public class JDBCDataSource {
	/**
	 * JDBC Database connection pool ( DCP )
	 */
	private static JDBCDataSource datasource;

	private JDBCDataSource() {
	}

	private ComboPooledDataSource cpds = null;

	/**
	 * Create instance of Connection Pool
	 *
	 * @return
	 */
	public static JDBCDataSource getInstance() {
		if (datasource == null) {
			ResourceBundle rb = ResourceBundle.getBundle("homeNowApp.System");
			datasource = new JDBCDataSource();
			datasource.cpds = new ComboPooledDataSource();
			try {
				datasource.cpds.setDriverClass(rb.getString("driver"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			datasource.cpds.setJdbcUrl(rb.getString("url"));
			datasource.cpds.setUser(rb.getString("username"));
			datasource.cpds.setPassword(rb.getString("password"));
			datasource.cpds.setInitialPoolSize(Integer.valueOf((String) rb.getString("initialPoolSize")));
			datasource.cpds.setAcquireIncrement(Integer.valueOf((String) rb.getString("acquireIncrement")));
			datasource.cpds.setMaxPoolSize(Integer.valueOf((String) rb.getString("maxPoolSize")));
			datasource.cpds.setMaxIdleTime(DataUtility.getInt(rb.getString("timeout")));
			datasource.cpds.setMinPoolSize(Integer.valueOf((String) rb.getString("minPoolSize")));
		}
		return datasource;
	}

	/**
	 * Gets the connection from ComboPooledDataSource
	 *
	 * @return connection
	 */
	public static Connection getConnection() throws Exception {
		return getInstance().cpds.getConnection();
	}

	/**
	 * Closes a connection4
	 *
	 * @param connection
	 * @throws Exception
	 */
	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
			}
		}
	}
		

}
