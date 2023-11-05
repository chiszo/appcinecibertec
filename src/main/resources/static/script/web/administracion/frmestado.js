$(document).on("click","#btnnuevo",function(){
    //alert("Hola :D");
    $("#modalestado").modal("show");
    $("#txtdescripcion").val("");
    $("#hddidestado").val("");
});

$(document).on("click",".btneliminar",function(){
    $("#modalestado").modal("show");
});

$(document).on("click",".btnactualizar",function(){
    $("#modalestado").modal("show");
    $("#txtdescripcion").val($(this).attr("data-descestado"));
    $("#hddidestado").val($(this).attr("data-idestado"));
});