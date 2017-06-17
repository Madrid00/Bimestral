//Buscar todos

$.ajax({
    url:'direccion',
    type: 'get',
    success: function(json){
console.log('Numero de elementos encontrados' +json.length);
for(var i=0;i<json.length;i++){
$("#elementos").append("<li>" + json[i].municipio+"</li>");
$("#tablita").append("<tr><td>"+json[i].id+"</td><td>"+json[i].numero+"</td><td>"+json[i].calle+"</td><td>"+json[i].cp+"</td><td>"+json[i].municipio+"</td></tr>")
}
}
});



//vamos a hacer el request a nuestro servicio usuando ajax con jquery
$("#guardarDireccion").click(function(){
            //Aplicamos el metodo post usando la uri del servicio
            var numero=$("#numero").val();
            var calle=$("#calle").val();
            var cp=$("#cp").val();
            var municipio=$("#municipio").val();
            
          $.post("direccion/"+numero+'/'+calle+'/'+cp+'/'+municipio,function(json){
              console.log(json.id);
               })  ;
            
           }
        );

$("#buscarPorId").click(function(){
            //Aplicamos el metodo post usando la uri del servicio
            var id=$("#id").val();
      
            
          $.get("direccion/"+id,function(json){
              console.log(json.municipio);
              $("#numero2").val(json.numero);
              $("#calle2").val(json.calle);
              $("#cp2").val(json.cp);
              $("#municipio2").val(json.municipio);
               })  ;
            
           }
        );
