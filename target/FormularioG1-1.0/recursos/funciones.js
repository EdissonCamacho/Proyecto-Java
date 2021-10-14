function validarForma(forma){
    var usuario=forma.usuario;
    var password=forma.password;
    if(usuario.value=="" || usuario.value=="Escribir usuario"){
        alert("Digite un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
        
    }
    if (password.value=="" || password.value.length<5) {
        alert("Proporcione una contraseña valida , >= 5 caracteres ");
        
        password.focus();
        password.select();
        return false;
        
        
        
    }
    
    var lenguaje = forma.lenguajes;
    var checkSeleccionado = false;
    
    for (var i = 0; i < lenguaje.length; i++) {
        if (lenguaje[i].checked) {
            checkSeleccionado=true;
            
        }
        
    }
    
    if (!checkSeleccionado) {
        alert("Seleccione un lenguaje");
        return false;
        
        
    }
    
    
    var genero = forma.genero;
    var radioSelect = false;
   
    for (var i = 0; i < genero.length; i++) {
        
        if (genero[i].checked) {
            
            radioSelect=true;
            
            
        }
        
    }
    
    if(!radioSelect){
        alert("seleccione un genero");
        return false;
        
    }
    
    var ocupacion = forma.ocupacion;
    
    if(ocupacion.value==""){
        alert("seleccione una ocupacion");
        return false;
        
    }
    
    alert("Formulario Validado, Enviando datos al servidor");
    
    return true;
    
    
    
    
    
}

