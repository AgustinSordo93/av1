var currentRecord = {}

function save() {
    currentRecord.nombre = $('#nombre').val();
    currentRecord.apellido = $('#apellido').val();
    currentRecord.observaciones = $('#observaciones').val(); 

    $.ajax({
        method : 'POST',
        url : 'http://localhost:8080/personas',
        contentType : 'application/json',
        data : JSON.stringify(currentRecord),
        success : () => {
            currentRecord = {};
            alert('Se guardo la persona correctamente.');
            $('#nombre').val('');
            $('#apellido').val('');
            $('#observaciones').val('');
            $('#nombre').focus()
            load();
        },
        error : () => {
            alert('Ha ocurrido un error');
        }
    })
}

function load() {

    var lista = $('#lista');
    lista.html('');
    $.ajax({
        method : 'GET',
        url : 'http://localhost:8888/personas',
        success : (response) => {
            response.forEach((item) => {
                lista.append($(`<div class="lista-item d-flex justify-content-between"><span>${item.nombre} ${item.apellido}</span><button class="btn btn-primary" onclick="loadPersona(${item.id})">Ver</button></div>`));
            });
        },
        error : () => {
            alert('Ha ocurrido un error')
        }
    })

}

function loadPersona(id) {

    $.ajax({
        method : 'GET',
        url : 'http://localhost:8888/personas/' + id,
        success : function (response) {
            currentRecord = response;
            $('#nombre').val(response.nombre);
            $('#apellido').val(response.apellido);
            $('#observaciones').val(response.observaciones);
        },
        error : function () {
            alert('Ha ocurrido un error al leer la persona');
        }
    })
}

$(() => {
 load();   
})

