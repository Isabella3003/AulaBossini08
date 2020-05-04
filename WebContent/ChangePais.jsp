<% @ page  language = " java "  contentType = " text / html; charset = UTF-8 "
    pageEncoding = " UTF-8 " %>
<% @ taglib  uri = " http://java.sun.com/jsp/jstl/core "  prefixo = " c " %>
<! DOCTYPE html>
< html  lang = " pt-br " >
	< cabeça >
		< meta  charset = " UTF-8 " >
		< Meta  http-equiv = " X-UA-Compatible "  conteúdo = " IE = bordo " >
		< meta  name = " viewport "  content = " width = largura do dispositivo, escala inicial = 1, encolher para ajustar = não " >

		< link  href = " css / bootstrap.min.css "  rel = " folha de estilo " >
		< link  href = " css / style.css "  rel = " folha de estilo " >

		< title > Editar País </ title >
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
			< h3  class = " page-header " > Edição País </ h3 >
			< formulário  action = " controller.do "  method = " post " >
				< div  class = " row " >
					< div  class = " grupo de formulários col-md-12 " >>
						< input  type = " hidden "  name = " id "  value = " $ { pais . id } " >
						< label  for = " nome " > Nome: </ label >
						< input  type = " text "  name = " nome "  class = " controle de formulário "  id = " nome "  tamanho máximo necessário  = " 100 " espaço reservado = " Nome do país " value = " $ { pais . nome } " >  
					</ div >
				</ div >
				< div  class = " row " >
					< div  class = " form-group col-md-6 " >>
						< label  for = " nome " > População: </ label >
						< input  type = " text "  name = " populacao "  class = " form-control "  id = " populacao "  maxlength obrigatório  = " 100 " espaço reservado = " População do país " value = " $ { pais . populacao } " >  
					</ div >

					< div  class = " form-group col-md-6 " >>
						< label  for = " nome " > Área: </ label >
						< input  type = " text "  name = " area "  class = " form-control "  id = " area "  required  maxlength = " 100 "  espaço reservado = " Área do país "  value = " $ { pais . area } " >
					</ div >
				</ div >
				< hr />
				< div  id = " actions "  class = " row " >
					< div  class = " col-md-12 " >
						< tipo de botão  = " enviar " classe = " btn btn-primary " nome = " comando " value = " ChangePais " > Salvar </ button >   
						< A  href = " ListarPaises.jsp "  class = " btn btn-default " > Cancelar </ a >
					</ div >
				</ div >
			</ form >
		</ div >

		< tipo de script  = " js / jquery.min.js " > </ script >
		< script  type = " js / bootstrap.min.js " > </ script >
	</ corpo >
</ html > 
