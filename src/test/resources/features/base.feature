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
      |nombre|apellido|correo           |mes     | año  |dia|ciudad|codigo_postal|pais  |sistema_operativo|version_s_o|idioma_s_o|contraseña   |
      |Hector|Dickens |correo@gmail.com |November| 1997 |28 |Panama|507          |Panama|Windows          |10         |Spanish   |*TEST_page123|
    Entonces Validar mensaje de bienvenida al nuevo usuario

