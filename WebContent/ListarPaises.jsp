<% @ page  language = " java "  contentType = " text / html; charset = UTF-8 "
    pageEncoding = " UTF-8 " %>
<% @ taglib  uri = " http://java.sun.com/jsp/jstl/core "  prefixo = " c " %>
<! DOCTYPE html>
< html  lang = " pt-br " >
	< cabeça >
		< meta  charset = " UTF-8 " >
		< Meta  http-equiv = " X-UA-Compatible "  conteúdo = " IE = bordo " >
		< meta  name = " viewport "  content = " width = largura do dispositivo, escala inicial = 1 " >
		< title > Buscar Países </ title >

		< link  href = " css / bootstrap.min.css "  rel = " folha de estilo " >
		< link  href = " css / style.css "  rel = " folha de estilo " >
	</ cabeça >
	< corpo >
		<! - Modal ->
		< div  class = " modal fade "  id = " delete-modal "  tabindex = " -1 "  role = " dialog "  aria-labelledby = " modalLabel " >
			< div  class = " modal-dialog "  role = " document " >
				< div  class = " modal-content " >
					< div  class = " modal-header " >
						< tipo de botão  = " botão " classe = " fechar " data-ignorar = " modal " aria-label = " Fechar " > < span aria-hidden = " true " > & times ; </ span > </ botão >    
						< h4  class = " modal-title "  id = " modalLabel " > Excluir Cliente </ h4 >
					</ div >
					< div  class = " modal-body " >
						Deseja realmente excluir este cliente?
					</ div >
					< div  class = " modal-footer " >
						< formulário  action = " controller.do "  method = " post " >
							< input  type = " hidden "  name = " command "  value = " excluirPais " >
							< input  type = " hidden "  name = " id "  id = " id_excluir "  value = " id_excluir " />
							< tipo de botão  = " enviar " classe = " btn btn-primary " nome = " ação " value = " excluir " > Sim </ button >   
							< tipo de botão  = " botão " class = " btn btn-padrão " data-dispensar = " modal " > N & atilde ; o </ botão >  

						</ form >
					</ div >
				</ div >
			</ div >
		</ div >
		<! - /.modal ->

		<! - Barra superior com menus de navegação ->
		< c: import  url = " Menu.jsp " />
		<! - Principal do contêiner ->
		< div  id = " main "  class = " container " >
			< formulário  action = " controller.do "  method = " post " >
				< div  id = " top "  class = " row " >
					< div  class = " col-md-3 " >
						< h2 > Países </ h2 >
					</ div >

					< div  class = " col-md-6 " >
						< div  class = " input-group h2 " >
							< input  type = " hidden "  name = " command "  value = " ListarPaises " >
							< input  name = " data [search] "  class = " form-control "  id = " search "  type = " text "  espaço reservado = " Pesquisar Países (deixe apenas para trazer todos) " >
							< span  class = " input-group-btn " >
								< classe do botão  = " btn btn-primary " type = " submit " name = " acao " value = " buscar " >   
									< span  class = " glyphicon glyphicon-search " > </ span >
								</ button >
							</ span >
						</ div >
					</ div >

					< div  class = " col-md-3 " >
						< A  href = " CriarPais.jsp "  class = " btn h2 pull-direito btn-primária " > Novo Pais </ a >
					</ div >
				</ div >
				<! - / # top ->
			</ form >
			< hr />
			< c: if  test = " $ { not empty list } " >
				< div  id = " list "  class = " row " >
					< div  class = " responsivo à tabela col-md-12 " >
						< tabela  class = " tabela com distribuição de tabela "  cellpacing = " 0 "  cellpadding = " 0 " >
							< thead >
								< tr >
									< th > ID </ th >
									< th > Nome </ th >
									< th > População </ th >
									< th > Área </ th >
									< th  class = " actions " > Ações </ th >
								</ tr >
							</ thead >
							< tbody >
								< c: forEach  var = " pais "  items = " $ { lista } " >
									< tr >
										< td >
											$ { pais . id }
										</ td >
										< td >
											$ { pais . nome }
										</ td >
										< td >
											$ { pais . população }
										</ td >
										< td >
											$ { pais . área }
										</ td >
										< td >
											< A  class = " btn btn-sucesso btn-xs "  href = " controller.do?command=VisualizarPais&id= $ { pais . Id } " > Visualizar </ a >
											< A  class = " btn btn-aviso btn-xs "  href = " controller.do?command=EditarPais&id= $ { pais . Id } " > Editar </ a >
											< button  id = " btn $ { pais . id } "  type = " button "  class = " btn btn-perigo btn-xs "  data-toggle = " modal "  data-target = " # delete-modal "  data-pais = " $ { pais . id } " > excluir </ button >
										</ td >
									</ tr >
								</ c: forEach >
							</ tbody >
						</ tabela >
					</ div >
				</ div >
				<! - / # lista ->

				< div  id = " bottom "  class = " row " >
					< div  class = " col-md-12 " >
						<! - paginação ainda não foi implementada ->
						< ul  class = " paginação " >
							< Li  class = " desativado " > < a > & lt ; Anterior </ a > </ li >
							< Li  class = " desativado " > < um > 1 </ a > </ li >
							< Li  class = " desativado " > < uma > 2 </ a > </ li >
							< Li  class = " desativado " > < uma > 3 </ a > </ li >
							< Li  class = " próxima " > < a  href = " # "  rel = " próxima " > Próximo & gt ; </ a > </ li >
						</ ul >
						<! - ./pagination ->
					</ div >
				</ div >
			</ c: se >
			<! - / # inferior ->
		</ div >
		<! - / # main ->

		< script  src = " js / jquery.min.js " > </ script >
		< script  src = " js / bootstrap.min.js " > </ script >
		< tipo de script  = " text / javascript " >
			$ ( " # delete-modal " ). on ( ' show.bs.modal ' , função ( evento ) {
				botão var =  $ ( event . relatedTarget ); // botao que disparou um modal
				destinatário var =  botão . dados ( ' pais ' );
				$ ( " #id_excluir " ). val (destinatário);
			});
		</ script >
	</ corpo >	
</ html > 
