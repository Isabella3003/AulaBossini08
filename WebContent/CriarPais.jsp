<% @ page  language = " java "  contentType = " text / html; charset = UTF-8 "
    pageEncoding = " UTF-8 " %>
<! DOCTYPE html>
< html  lang = " pt-br " >
	< cabeça >
		< meta  charset = " UTF-8 " >
		< Meta  http-equiv = " X-UA-Compatible "  conteúdo = " IE = bordo " >
		< meta  name = " viewport "  content = " width = largura do dispositivo, escala inicial = 1, encolher para ajustar = não " >

		< link  href = " css / bootstrap.min.css "  rel = " folha de estilo " >
		< link  href = " css / style.css "  rel = " folha de estilo " >

		< title > Cadastro Países </ title >
	</ cabeça >
	< corpo >
		< nav  class = " navbar navbar-inverso navbar-fixo-superior " >
			< div  class = " container-fluid " >
				< div  class = " navbar-header " >
					< tipo de botão  = " botão " class = " navbar-toggle recolhido " data-toggle = " recolhido " data-target = " #navbar " aria-expandido = " false " aria-controls = " navbar " >     
						< span  class = " sr-only " > Menu de navegação superior </ span >
						< span  class = " barra de ícones " > </ span >
						< span  class = " barra de ícones " > </ span >
						< span  class = " barra de ícones " > </ span >	
					</ button >
					< A  class = " navbar-brand "  href = " index.html " > Cadastro </ a >
				</ div >
				< div  id = " navbar "  class = " navbar-collapse collapse " >
					< ul  class = " nav navbar-nav navbar-right " >
						< Li  class = " nav-ponto " > < a  href = " index.html " > Paises </ a > </ li >
					</ ul >
				</ div >
			</ div >
		</ nav >

		< div  id = " main "  class = " container " >
			< h3  class = " page-header " > Cadastro Países </ h3 >
			< formulário  action = " controller.do "  method = " post " >
				< div  class = " row " >
					< div  class = " grupo de formulários col-md-12 " >>
						< label  for = " nome " > Nome: </ label >
						< input  type = " text "  name = " nome "  class = " controle de formulário "  id = " nome "  tamanho máximo necessário  = " 100 " espaço reservado = " Nome do país " > 
					</ div >
				</ div >
				< div  class = " row " >
					< div  class = " form-group col-md-6 " >>
						< label  for = " nome " > População: </ label >
						< Entrada  tipo = " texto "  nome = " População "  class = " form-controle "  id = " População "  necessário  maxlength = " 100 "  espaço reservado = " População fazer PaaS " >
					</ div >

					< div  class = " form-group col-md-6 " >>
						< label  for = " nome " > Área: </ label >
						< Entrada  tipo = " texto "  nome = " área "  class = " -controle de formulário "  id = " área "  necessário  maxlength = " 100 "  espaço reservado = " Área fazer PaaS " >
					</ div >
				</ div >
				< hr />
				< div  id = " actions "  class = " row " >
					< div  class = " col-md-12 " >
						< tipo de botão  = " enviar " classe = " btn btn-primary " nome = " comando " value = " CriarPais " > Salvar </ button >   
						< A  href = " index.html "  class = " btn btn-default " > Cancelar </ a >
					</ div >
				</ div >
			</ form >
		</ div >

		< tipo de script  = " js / jquery.min.js " > </ script >
		< script  type = " js / bootstrap.min.js " > </ script >
	</ corpo >
</ html > 
