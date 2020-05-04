modelo de embalagem ;

 classe  pública Pais {

	private  int id;
	 nome de String privado ;
	 população longa e privada ;
	 área dupla privada ;

	 Pais público () {}

	 Pais público ( id int  ) {
		isso . id = id;
	}

	 Pais públicos ( id int  , nome da string , população longa , área dupla ) {   
		isso . id = id;
		isso . nome = nome;
		isso . população = população;
		isso . área = área;
	}

	public  int  getId () {
		id de retorno ;
	}

	public  void  setId ( int  id ) {
		isso . id = id;
	}

	public  String  getNome () {
		return nome;
	}

	public  void  setNome ( String  nome ) {
		isso . nome = nome;
	}

	public  long  getPopulacao () {
		retorno populacao;
	}

	public  void  setPopulacao ( população longa  ) {
		isso . população = população;
	}

	public  double  getArea () {
		área de retorno ;
	}

	público  vazio  setArea ( área dupla  ) {
		isso . área = área;
	}

	@Sobrepor
	public  String  toString () {
		retornar  " Pais [id = "  + id +  " , nome = "  + nome +  " , população = "  + população +  " , área = "  + área +  " ] " ;
	}

	@Sobrepor
	 igual a público booleano  ( Object obj ) { 
		if ( este  == obj)
			return  true ;
		if (obj ==  null )
			retornar  falso ;
		if (getClass () ! = obj . getClass ())
			retornar  falso ;
		Pais outros = ( Pais ) obj;
		if (população == outra . área)
			retornar  falso ;
		if (area ! = other . area)
			retornar  falso ;
		if (id ! = outro . id)
			retornar  falso ;
		if (nome ==  null ) {
			if (outro . nome ! =  null )
				retornar  falso ;
		} else  if ( ! nome . igual a (outro . nome))
			retornar  falso ;
		return  true ;
	}

}
