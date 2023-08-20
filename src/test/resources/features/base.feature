#autor:Hector Dickens
  #language: es

  @HistoriaDeUsuario
  Característica: Crear un nuevo usuario en la pagina Utest
    Yo como usuario quiero registrarme en la pagina Utest

  @Caso
  Escenario: Crear un nuevo usuario
    Dado que el usuario ingrese a la pagina Utest
    Cuando proceda a dar clic en la opción de registro
    Y complete la información solicitada en el formulario
    Entonces Validar mensaje de bienvenida al nuevo usuario

