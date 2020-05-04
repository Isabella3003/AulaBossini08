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

public  class  CriarPais  implementa  Command {

	@Sobrepor
	pública  vazio  executar ( HttpServletRequest  pedido , HttpServletResponse  resposta )
			lança  ServletException , IOException {
		Sessão HttpSession = solicitação . getSession ();

		String pNome = request . getParameter ( " nome " );
		String pPopulacao = request . getParameter ( " população " );
		String pArea = request . getParameter ( " área " );

		população longa =  longa . parseLong (pPopulacao);
		área dupla =  dupla . parseDouble (pArea);

		Pais pais =  novo  Pais ();
		PaisService ps =  novo  PaisService ();

		pais . setNome (pNome);
		pais . setPopulacao (populacao);
		pais . setArea (área);

		ps . incluir (pais);
		ArrayList < Pais > lista =  new  ArrayList <> ();
		lista . adicionar (pais);
		sessão . setAttribute ( " lista " , lista);
		Visualização RequestDispatcher = request . getRequestDispatcher ( " ListarPaises.jsp " );
		vista . encaminhar (solicitação, resposta);

	}
}
