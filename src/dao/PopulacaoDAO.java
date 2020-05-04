pacote  dao ;

importar  java.sql.Connection ;
import  java.sql.PreparedStatement ;
import  java.sql.ResultSet ;
importar  java.sql.SQLException ;
importar  java.util.ArrayList ;
importar  java.util.List ;

importação  model.Pais ;

 classe  pública PopulacaoDAO {

	public  int  incluir ( Pais  pais ) {
		String sqlInsert =  " INSERIR EM pais (nome, população, área) VALORES (?,?,?) " ;
		try ( Conexão conn =  ConnectionFactory . obtemConexao ();
				PreparedStatement stm = conn . prepareStatement (sqlInsert)) {
			stm . setString ( 1 , pais . getNome ());
			stm . setLong ( 2 , pais . getPopulacao ());
			stm . setDouble ( 3 , pais . getArea ());

			stm . executar();

			String sqlQuery =  " SELECT LAST_INSERT_ID () " ;
			try ( PreparedStatement stm2 = conn . prepareStatement (sqlQuery);
					ResultSet rs = stm2 . executeQuery ();) {
				if (rs . next ()) {
					pais . setId (rs . getInt ( 1 ));
				}
			}
		} captura ( SQLException e) {
			e . printStackTrace ();
		}
		retornar pais . getId ();
	}

	public  void  atualizar ( Pais  pais ) {
		String sqlUpdate =  " UPDATE pais SET nome = ?, população = ?, area =? WHERE id =? " ;
		try ( Conexão conn =  ConnectionFactory . obtemConexao ();
				PreparedStatement stm = conn . prepareStatement (sqlUpdate)) {
			stm . setString ( 1 , pais . getNome ());
			stm . setLong ( 2 , pais . getPopulacao ());
			stm . setDouble ( 3 , pais . getArea ());
			stm . setInt ( 4 , pais . getId ());

			stm . executar();
		} captura ( SQLException e) {
			e . printStackTrace ();
		}
	}

	public  void  excluir ( Pais  pais ) {
		String sqlDelete =  " DELETE FROM pais WHERE id =? " ;
		try ( Conexão conn =  ConnectionFactory . obtemConexao ();
				PreparedStatement stm = conn . prepareStatement (sqlDelete)) {
			stm . setInt ( 1 , pais . getId ());

			stm . executar();
		} captura ( SQLException e) {
			e . printStackTrace ();
		}
	}

	pública  Pais  CARREGAR ( Pais  pais ) {
		String sqlSelect =  " SELECT id, nome, população, área FROM pais WHERE id =? " ;
		try ( Conexão conn =  ConnectionFactory . obtemConexao ();
				PreparedStatement stm = conn . prepareStatement (sqlSelect)) {
			stm . setInt ( 1 , pais . getId ());
			try ( ResultSet rs = stm . executeQuery ();) {
				if (rs . next ()) {
					pais . setId (rs . getInt ( " id " ));
					pais . setNome (rs . getString ( " nome " ));
					pais . setPopulacao (rs . getLong ( " populacao " ));
					pais . setArea (rs . getDouble ( " area " ));
				}
			} captura ( SQLException e) {
				e . printStackTrace ();
			}
		} captura ( SQLException e1) {
			Sistema . fora . println (e1 . getStackTrace ());
		}

		retorno pais;
	}

	public  ArrayList < Pais > carregarTodosPaises () {
		ArrayList < Pais > paises =  new  ArrayList <> ();
		String sqlSelectAll =  " SELECT * FROM pais " ;
		try ( Conexão conn =  ConnectionFactory . obtemConexao ();
				PreparedStatement stm = conn . prepareStatement (sqlSelectAll);
				ResultSet rs = stm . executeQuery ()) {
			while (rs . next ()) {
				paises . add ( novo  Pais (rs . getInt ( " id " ), rs . getString ( " nome " ), rs . getLong ( " população " ), rs . getDouble ( " area " ))));
			}
		} captura ( SQLException e) {
			e . printStackTrace ();
		}
		pais de retorno ;
	}

	public  ArrayList < Pais >  listarPaises ( String  chave ) {
		Pais pais;
		ArrayList < Pais > lista =  new  ArrayList <> ();
		String sqlSelect =  " SELECT * FROM pais WHERE superior (nome) como? " ;

		try ( Conexão conn =  ConnectionFactory . obtemConexao ();
				PreparedStatement stm = conn . prepareStatement (sqlSelect);) {
			stm . setString ( 1 , " % "  + chave . toUpperCase () +  " % " );
			try ( ResultSet rs = stm . executeQuery ();) {
				while (rs . next ()) {
					pais =  novo  Pais ();
					pais . setId (rs . getInt ( " id " ));
					pais . setNome (rs . getString ( " nome " ));
					pais . setPopulacao (rs . getLong ( " populacao " ));
					pais . setArea (rs . getDouble ( " area " ));
					lista . adicionar (pais);
				}
			} captura ( SQLException e) {
				e . printStackTrace ();
			}
		} captura ( SQLException e1) {
			Sistema . fora . println (e1 . getStackTrace ());
		}

		lista de retorno ;
	}
}
