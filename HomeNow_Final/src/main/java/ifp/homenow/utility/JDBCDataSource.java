package ifp.homenow.utility;

import java.util.ResourceBundle;


/*Interface que hereda de CommonDataSource y WrapperClass. Contiene dos métodos como 
 * getConnection() y getConnection(String username, String password). Se emplea como 
 * alternativa al clásico DriverManager, permitiendo establecer um pool connection.
 */

public class JDBCDataSource {

	//Orientación hacia archivo properties para configuración de los datos de la BBDD
	ResourceBundle rb=ResourceBundle.getBundle("homeNowApp.System");
	
	//Obtener url de la BBDD
	String url = rb.getString("url");
	
	
}
