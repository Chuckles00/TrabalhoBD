/**
 * 
 */

function verifica_exclusao() {

	if (confirm("Deseja realmente excluir o registro?")) {
		document.forms[0].submit();
	} else {
		return false;
	}
}
