/**
 * 
 */
function disabledInput(){
	$('.info').prop("disabled", true);
	$('.bouton').val("+");
}

function modifierClient(obj) {

	if ($(obj).val() === "+") {
		disabledInput();
		$("#ligneAjoutClient").hide();
		$("#boutonAjoutClient").show();
		
		$(obj).val("modifier");	
		//récup toute les classes
		var className = $(obj).attr('class');
		//sépare les classes
		var classNameSplit = className.split(" ");
		//récup la première classe
		var classNameLine = "." + classNameSplit[0];
		var classReset = classNameLine;
		$(".reset").hide();
		$(classReset).show();

		$(classNameLine).removeAttr("disabled");

	} else {
		$("#formulaire").submit();			
	}		
}
function ajoutClient(boutonEnvoi){

	if ($(boutonEnvoi).val()== "+") {
		disabledInput();
		$(boutonEnvoi).hide();
		$(".reset").hide();
		$(".formAjout").show();
		$("#ligneAjoutClient").show();		
		$(".formAjout").removeAttr("disabled");
	}else {
		$("#ajoutClient").submit();
	}

}

function resetLigne(obj){
	
	$("#formulaire").trigger("reset");
	disabledInput();
	$(".reset").hide();
	
}

function resetAjoutForm(obj){
	$("#ajoutClient").trigger("reset");
	disabledInput();
	$(".formAjout").hide();
	$("#boutonAjoutClient").show();
	
	
	
}





function affichageConsole(){
	
	console.log("booh!");
	
}

$('.formAjout').click(function(event){
	affichageConsole();
	var color = 1;
	
	if (color === 1) {
		$(".formAjout").removeClass("color-FieldEmpty").addClass("color-FieldOk");
		color = 2;
	} else {
		$(".formAjout").removeClass("color-FieldOk").addClass("color-FieldEmpty");
		color = 1;
	}
});
	
	
	
	
	
	
	


