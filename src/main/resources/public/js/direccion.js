//vamos a hacer el request a nuestro servicio usuando ajax con jquery
$("#guardarDireccion").click(function() {
    //Aplicando el metodo post usando la uri del servicio
var numero=$("#numero").val();
var calle=$("#calle").val();
var cp=$("#cp").val();
var municipio=$("#municipio").val();
$.post("direccion/"+numero+'/'+calle+'/'+cp+'/'+municipio,function(json){
console.log(json.id);
});
}
);
