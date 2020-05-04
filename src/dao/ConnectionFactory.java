pacote  dao ;

importar  java.sql.Connection ;
importar  java.sql.DriverManager ;
importar  java.sql.SQLException ;

 classe  pública ConnectionFactory {
	estático {
		tente {
			Class . forName ( " com.mysql.cj.jdbc.Driver " );
		} catch ( ClassNotFoundException e) {
			lançar  nova  RuntimeException (e);
		}
	}

	// Obtenção de conexão com o banco de dados
	 conexão estática  pública obtemConexao () lança SQLException {  
		retornar  DriverManager
				.getConnection ( " jdbc: mysql: // localhost / mundo? usuário = aluno & senha = Usjt @@ 192 " );
	}
}
