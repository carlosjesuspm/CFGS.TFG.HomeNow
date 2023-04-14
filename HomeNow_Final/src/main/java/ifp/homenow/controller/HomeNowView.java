package ifp.homenow.controller;

public interface HomeNowView {

	//String de ayuda a la navegación
	public final String APP_CONTEXT="/HomeNow_Final";
	public final String PAGE_FOLDER="/jsp";
	public final String PAGE_IMG="/img";
	public final String PAGE_WEBINF="/WEB-INF";
	
	
	// Links Header y Footer
	String comprar=APP_CONTEXT+PAGE_FOLDER+"/comprar.jsp";
	String compartir=APP_CONTEXT+PAGE_FOLDER+"/compartir.jsp";
	String alquilar=APP_CONTEXT+PAGE_FOLDER+"/alquilar.jsp";
	String favoritos=APP_CONTEXT+PAGE_FOLDER+"/favoritos.jsp";
	String publicar=APP_CONTEXT+PAGE_FOLDER+"/publicar.jsp";
	String contacto=APP_CONTEXT+PAGE_FOLDER+"/contacto.jsp";
	String accceder=PAGE_FOLDER+"/acceder.jsp";
	String index=APP_CONTEXT+"/index.jsp";
	
	
	//Links Acceder View
	String userRegistro=PAGE_FOLDER+"/userRegistro.jsp";
	String recuperarContrasena=PAGE_FOLDER+"/recuperarContrasena.jsp";
	String perfil=PAGE_FOLDER+"/perfil.jsp";
	
	
	//Servlets
	String accederController=APP_CONTEXT+"/accederController";
	String registroController=APP_CONTEXT+"/registroController";
}

