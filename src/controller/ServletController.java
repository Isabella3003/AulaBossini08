controlador de pacote ;

importar  java.io.IOException ;
importar  javax.servlet.ServletException ;
importar  javax.servlet.annotation.WebServlet ;
importar  javax.servlet.http.HttpServlet ;
importar  javax.servlet.http.HttpServletRequest ;
importar  javax.servlet.http.HttpServletResponse ;

importação  command.Command ;

@WebServlet ( " /controller.do " )
 classe  pública ServletController  estende  HttpServlet {
	 serialVersionUID longo final estático  privado = 1L ;  

	 void  doExecute protegido ( solicitação HttpServletRequest  , resposta HttpServletResponse ) lança ServletException , IOException {  
		tente {
			pedido . setCharacterEncoding ( " UTF-8 " );
			Comando comando = ( Command ) Class . forName ( " comando. "  + pedido . getParameter ( " comando " )) . newInstance ();
			comando . executar (solicitação, resposta);
		} catch ( InstantiationException  |  IllegalAccessException  |  ClassNotFoundException e) {
			e . printStackTrace ();
			lançar  nova  ServletException (e);
		}
	}

	O  void  doGet protegido ( solicitação HttpServletRequest  , resposta HttpServletResponse ) lança ServletException , IOException {  
		doExecute (solicitação, resposta);
	}

	 doPost void  protegido ( solicitação HttpServletRequest , resposta HttpServletResponse ) lança ServletException , IOException {   
		doExecute (solicitação, resposta);
	}

}
