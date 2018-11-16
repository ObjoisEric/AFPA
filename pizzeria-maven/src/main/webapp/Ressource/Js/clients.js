/**
 * 
 */
function disabledInput(){
	$('.info').prop("disabled", true);
	$('.bouton').val("+");
	$(".id").hide();
}

function modifierClient(obj) {

	if ($(obj).val() === "+") {
		disabledInput();
		$(".id").hide();
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
		$(".id").hide();
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
		$(".reset").removeClass("FieldOk");
	}
		


}

function resetLigne(obj){
	
	$("#formulaire").trigger("reset");
	disabledInput();
	$(".reset").hide();
	
}



function affichageConsole(){
	
	console.log("booh!");
	
}

$('.formAjout').on(
		{
			click:function(){
				colorChange(this);
			}
		,
			change:function(){
				colorChange(this);
			}
		});
	
	
function colorChange(obj){
	if ($(obj).val()) {
		$(obj).removeClass("FieldEmpty").addClass("FieldOk");
		
	} else {
		$(obj).removeClass("FieldOk").addClass("FieldEmpty");
		
	}
}	


function verifForm(obj){
	
	
	if ($(".formAjout").val()) {
		$("#ajoutClient").submit();
		
	} else {
		
	}
	
	
}

function resetAjoutForm(obj){
	$("#ajoutClient").trigger("reset");
	
	$("#ligneAjoutClient").hide();
	$("#boutonAjoutClient").show();
	$(".formAjout").removeClass("FieldOk");
	console.log("fieldOKremoveClassformAjout")
	$(this).removeClass("FieldOk");
	console.log("fieldOKremoveClassThis")
	$(".formAjout").removeClass("FieldEmpty");
	disabledInput();
	
}
	
	
	


