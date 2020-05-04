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

public  class  ListarPaises  implementa o  comando {
	@Sobrepor
	pública  vazio  executar ( HttpServletRequest  pedido , HttpServletResponse  resposta )
			lança  ServletException , IOException {
		// TODO Stub do método gerado automaticamente
		String chave = request . getParameter ( " dados [pesquisa] " );
		String acao = request . getParameter ( " acao " );

		PaisService ps =  novo  PaisService ();

		ArrayList < Pais > lista =  null ;
		Sessão HttpSession = solicitação . getSession ();

		if (acao ! =  null  && acao . equals ( " buscar " )) {
			if (chave ! =  null  && chave . length () >  0 ) {
				lista = ps . listarPaises (chave);
			} mais {
				lista = ps . listar ();
			}
			sessão . setAttribute ( " lista " , lista);
		} mais {
			sessão . setAttribute ( " lista " , nula );
		}

		RequestDispatcher dispatcher = request . getRequestDispatcher ( " ListarPaises.jsp " );
		expedidor . encaminhar (solicitação, resposta);
	}
}
