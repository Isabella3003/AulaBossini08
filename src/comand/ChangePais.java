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

 classe  pública ChangePais  implementa o  comando {

	@Sobrepor
	pública  vazio  executar ( HttpServletRequest  pedido , HttpServletResponse  resposta )
			lança  ServletException , IOException {
		Sessão HttpSession = solicitação . getSession ();

		String pId = request . getParameter ( " id " );
		String pNome = request . getParameter ( " nome " );
		String pPopulacao = request . getParameter ( " população " );
		String pArea = request . getParameter ( " área " );

		int id =  Inteiro . parseInt (pId);
		população longa =  longa . parseLong (pPopulacao);
		área dupla =  dupla . parseDouble (pArea);

		Pais pais =  novo  Pais ();
		PaisService ps =  novo  PaisService ();

		pais . setId (id);
		pais . setNome (pNome);
		pais . setPopulacao (populacao);
		pais . setArea (área);

		ps . atualizar (pais);
		Sessão ArrayList < Pais > lista = ( ArrayList < Pais > ) . getAttribute ( " lista " );
		int pos =  Busca . busca (pais, lista);
		lista . remover (pos);
		lista . add (pos, pais);
		sessão . setAttribute ( " lista " , lista);
		pedido . setAttribute ( " pais " , pais);
		Visualização RequestDispatcher = request . getRequestDispatcher ( " VisualizarPais.jsp " );
		vista . encaminhar (solicitação, resposta);

	}
}
