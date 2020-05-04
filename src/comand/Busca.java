comando do pacote ;

importar  java.util.ArrayList ;

importação  model.Pais ;

public  class  Busca {
	public  static  int  busca ( Pais  pais , ArrayList < Pais >  lista ) {
		Sistema . fora . println ( " PAIS para alterar: "  + pais);
		Pais para;
		for ( int i =  0 ; i < lista . size (); i ++ ) {
			para = lista . Entendi);
			if (to . getId () == pais . getId ()) {
				retornar i;
			}
		}
		retorno  - 1 ;
	}
}
