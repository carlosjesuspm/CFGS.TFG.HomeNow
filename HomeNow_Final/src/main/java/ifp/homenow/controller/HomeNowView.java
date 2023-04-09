package ifp.homenow.controller;

public interface HomeNowView {

	//String de ayuda a la navegación
	public final String APP_CONTEXT="/HomeNow_Final";
	public final String PAGE_FOLDER="/jsp";
	public final String PAGE_IMG="/img";
	
	
	// Links Header y Footer
	String comprar=PAGE_FOLDER+"/comprar.jsp";
	String compartir=PAGE_FOLDER+"/compartir.jsp";
	String alquilar=PAGE_FOLDER+"/alquilar.jsp";
	String favoritos=PAGE_FOLDER+"/favoritos.jsp";
	String publicar=PAGE_FOLDER+"/publicar.jsp";
	String contacto=PAGE_FOLDER+"/contacto.jsp";
	String accceder=PAGE_FOLDER+"/acceder.jsp";
	
	
	//Links Acceder View
	String userRegistro=APP_CONTEXT+PAGE_FOLDER+"/userRegistro.jsp";
	String recuperarContrasena=APP_CONTEXT+PAGE_FOLDER+"/recuperarContrasena.jsp";
	String perfil=APP_CONTEXT+PAGE_FOLDER+"/perfil.jsp";
	
	
	//Servlets
	String accederController=APP_CONTEXT+"/accederController";
}

