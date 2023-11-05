$(document).on("click","#btnnuevo",function(){
    //alert("Hola :D");
    $("#modalestado").modal("show");
    $("#txtdescripcion").val("");
    $("#hddidestado").val("0");
});

$(document).on("click",".btneliminar",function(){
    $("#modalestado").modal("show");
});

$(document).on("click",".btnactualizar",function(){
    $("#modalestado").modal("show");
    $("#txtdescripcion").val($(this).attr("data-descestado"));
    $("#hddidestado").val($(this).attr("data-idestado"));
});

$(document).on("click","#btnguardar",function(){
    $.ajax({
        type:"POST",
        contentType:"application/json",
        url:"/administracion/estado/registrar",
        data: JSON.stringify({
            idestado:$("#hddidestado").val(),
            descestado:$("#txtdescripcion").val()
        }),
        success: function(resultado){
            alert(resultado.mensaje);
            $("#modalestado").modal("hide")
        }
    });
});