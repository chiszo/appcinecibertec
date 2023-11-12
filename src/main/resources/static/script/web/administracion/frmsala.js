$(document).on("click","#btnnuevo",function(){
    //alert("Hola :D");
    $("#modalsala").modal("show");
    $("#txtdescripcion").val("");
    $("#cboestado").empty();
    $("#hddidsala").val("0");
    $.ajax({
    type:"GET",
            url:"/administracion/estado/listar",
            datatype: "json",
            success: function(resultado){
                $.each(resultado, function(index,value){
                    $("#cboestado").append(
                        `<option value="${value.idestado}">
                            ${value.descestado}
                        </option>`
                    )
                });
            }
        });
});

$(document).on("click",".btnactualizar",function(){
    $("#modalsala").modal("show");
    $("#txtdescripcion").val($(this).attr("data-descsala"));
    $("#txtasientos").val($(this).attr("data-asientos"));
    $("#cboestado").val($(this).attr("data-idestado"));
    $("#hddidsala").val($(this).attr("data-idsala"));
    $("#cboestado").empty();
    $.ajax({
        type:"GET",
                url:"/administracion/estado/listar",
                datatype: "json",
                success: function(resultado){
                    $.each(resultado, function(index,value){
                        $("#cboestado").append(
                            `<option value="${value.idestado}">
                                ${value.descestado}
                            </option>`
                        )
                    });
        }
    });
});
/*
$(document).on("click","#btnguardar",function(){
    $.ajax({
        type:"POST",
        contentType:"application/json",
        url:"/administracion/sala/registrar",
        data: JSON.stringify({
            idsala:$("#hddidsala").val(),
            descsala:$("#txtdescripcion").val()
            asientos:$("#txtasientos").val()
            idestado:$("#cboestado").val()
        }),
        success: function(resultado){
            if(resultado.respuesta){
                listarSala();
            }
            alert(resultado.mensaje);
            $("#modalsala").modal("hide")
        }
    });
});*/
/*
function listarEstados(){
    $.ajax({
        type:"GET",
        url:"/administracion/sala/listar",
        datatype: "json",
        success: function(resultado){
            $("#tblestado > tbody").html("");
            $.each(resultado, function(index, value){
                $("#tblsala > tbody").append(
            "<tr>"+
                "<td >"+value.idsala</td>
                "<td >"+value.descsala</td>
                <td >value.asientos</td>
                <td >value.estado.descestado</td>
                <td>
                    <button type='button' class='btn btn-info btnactualizar'
                            data-idsala='value.idsala'
                            data-descsala='value.descsala'
                            data-asientos='value.asientos'
                            data-idestado='value.estado.idestado'
                    >
                        <i class='bi bi-pencil-square'></i>
                    </button>
                </td>
            </tr>
                )
            });
        }
    });
}*/
