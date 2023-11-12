$(document).on("click","#btnnuevo",function(){
    //alert("Hola :D");
    $("#modalestado").modal("show");
    $("#txtdescripcion").val("");
    $("#hddidestado").val("0");
});

$(document).on("click",".btneliminar",function(){
    $("#lblmensajeeliminar").text("Está seguro de eliminar el curso " +
    $(this).attr("data-descestado") + "?");
    $("#hddidestadoeliminar").val($(this).attr("data-idestado"));
    $("#modaleliminarestado").modal("show");
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
            if(resultado.respuesta){
                listarEstados();
            }
            alert(resultado.mensaje);
            $("#modalestado").modal("hide")
        }
    });
});

$(document).on("click","#btneliminar",function(){
    $.ajax({
        type:"DELETE",
        contentType:"application/json",
        url:"/administracion/estado/eliminar",
        data: JSON.stringify({
            idestado:$("#hddidestadoeliminar").val(),
        }),
        success: function(resultado){
            if(resultado.respuesta){
                listarEstados();
            }
            alert(resultado.mensaje);
            $("#modaleliminarestado").modal("hide")
        }
    });
});

function listarEstados(){
    $.ajax({
        type:"GET",
        url:"/administracion/estado/listar",
        datatype: "json",
        success: function(resultado){
            $("#tblestado > tbody").html("");
            $.each(resultado, function(index, value){
                $("#tblestado > tbody").append(
                "<tr>" +
                "<td>" +
                    value.idestado +
                "</td>"+
                "<td>" +
                    value.descestado +
                "</td>" +
                "<td>" +
                    "<button type='button' class='btn btn-info btnactualizar'" +
                        "data-idestado='"+value.idestado+"'" +
                        "data-descestado='"+ value.descestado+"'>" +
                        "<i class='bi bi-pencil-square'></i>" +
                    "</button>"+
                "</td>"+
                "<td>" +
                        "<button type='button' class='btn btn-warning btneliminar'" +
                            "data-idestado='" + value.idestado + "'" +
                            "data-descestado='" + value.descestado + "'>" +
                            "<i class='bi bi-trash'></i>" +
                        "</button>"+
                "</td>"+
                "</tr>"
                )
            });
        }
    });
}
