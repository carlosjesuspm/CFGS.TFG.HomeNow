package ifp.homenow.utility;

public class DataValidator {

	//Permite evaluar y validar los datos de los formularios
	
	
	// Validar nombre 
	public static boolean validarNombre (String value){
		
		String name = "^[A-Za-z ]*$";
		  if (value.matches(name)) {
		    return true;
		  } else {
		    return false;
		  }
	}
	
	
	//Validar contraseña 
	
	public static boolean validarContrasena(String value) {
		  String passregex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[\\S])[A-Za-z0-9\\S]{6,12}$";
		  if (value.matches(passregex)) {
		    return true;
		  } else {
		    return false;
		  }
	}
	
	
	//Validar teléfono
	
	public static boolean validarTelefono(String value) {
		  String regex = "^[7-9][0-9]{9}$";
		  if (value.matches(regex)) {
		    return true;
		  } else {
		    return false;
		  }
	}
	
	
	//Validar fecha
	
	//public static boolean validarFecha(String val) {
		  //Date d = null;
		  //if (isNotNull(val)) {
		    //d = DataUtility.getDate(val);
		  //}
		  //return d != null;
		//}
	
	
	// Campo null l
	public static boolean isNull(String val) {
	    if (val == null || val.trim().length() == 0) {
	      return true;
	    } else {
	      return false;
	    }
	}
	  
	
	//Campo no nulo
	public static boolean isNotNull(String val) {
	    return !isNull(val);
	}
	  
	  
	// Validar correo electrónico
	
	public static boolean isEmail(String val) {
		  String emailreg = "[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{2,5}";
		  if (isNotNull(val)) {
		    try {
		      return val.matches(emailreg);
		    } catch (NumberFormatException e) {
		      return false;
		    }
		  } else {
		    return false;
		  }
		}
	
}
