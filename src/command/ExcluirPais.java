 comando do pacote ;

importar  java.io.IOException ;
importar  java.util.ArrayList ;

importar  javax.servlet.RequestDispatcher ;
importar  javax.servlet.ServletException ;
importar  javax.servlet.http.HttpServletRequest ;
importar  javax.servlet.http.HttpServletResponse ;
importar  javax.servlet.http.HttpSession ;

importação  model.Pais ;
 serviço de importação.PaisService ;

public  class  ExcluirPais  implementa  Command {
	@Sobrepor
	O  comando public void  executa ( solicitação HttpServletRequest  , resposta HttpServletResponse ) lança ServletException , IOException {  
		Sessão HttpSession = solicitação . getSession ();

		Pais pais =  novo  Pais ();
		PaisService ps =  novo  PaisService ();

		String pId = request . getParameter ( " id " );		
		int id =  Inteiro . parseInt (pId);

		pais . setId (id);

		ps . excluir (pais . getId ());
		Sessão ArrayList < Pais > lista = ( ArrayList < Pais > ) . getAttribute ( " lista " );
		lista . remove ( Busca . busca (pais, lista));
		sessão . setAttribute ( " lista " , lista);
		Visualização RequestDispatcher = request . getRequestDispatcher ( " ListarPaises.jsp " );
		vista . encaminhar (solicitação, resposta);
	}
}
