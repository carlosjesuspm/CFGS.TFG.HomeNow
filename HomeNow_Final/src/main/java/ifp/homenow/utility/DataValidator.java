package ifp.homenow.utility;

import java.util.Date;

public class DataValidator {

	// Permite evaluar y validar los datos de los formularios

	// Validar nombre, campo input o cualquier string
	public static boolean validarNombre(String value) {

		String name = "^[A-Za-z ]*$";
		if (value.matches(name)) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Validar contraseña
	 * 
	 * Mínimo 8 caracteres Máximo 15 Al menos una letra mayúscula Al menos una letra
	 * minúscula Al menos un dígito No espacios en blanco Al menos un caracter
	 * especial
	 */

	public static boolean validarContrasena(String value) {
		String passregex = "/^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}$/";
		if (value.matches(passregex)) {
			return true;
		} else {
			return false;
		}
	}

	// Validar teléfono

	public static boolean validarTelefono(String value) {
		String regex = "^[7-9][0-9]{9}$";
		if (value.matches(regex)) {
			return true;
		} else {
			return false;
		}
	}

	// Validar edad entre los 18 y 35

	public static boolean validarEdad(String value) {
		String regex = "^([1][8-9]|[2-5][0-9]|[3][0-5])$";
		if (value.matches(regex)) {
			return true;
		} else {
			return false;
		}
	}

	// Validar fecha

	public static boolean validarFecha(String val) {
		Date d = null;
		if (isNotNull(val)) {
			d = DataUtility.getDate(val);
		}
		return d != null;
	}

	// Campo null
	public static boolean isNull(String val) {
		if (val == null || val.trim().length() == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Campo no nulo
	public static boolean isNotNull(String val) {
		return !isNull(val);
	}

	// Entero o no entero
	public static boolean isInteger(String val) {
		@SuppressWarnings("unused")
		int i;
		if (isNotNull(val)) {
			try {
				i = Integer.parseInt(val);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		} else {
			return false;
		}
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

	// Validar código postal (números entre 01000-5299)

	public static boolean validarCodigoPostal(String value) {
		String regex = "/^(?:0?[1-9]|[1-4]\\d|5[0-2])\\d{3}$/";
		if (value.matches(regex)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isLong(String val) {
		if (isNotNull(val)) {
			try {
				long i = Long.parseLong(val);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		} else {
			return false;
		}
	}

}
