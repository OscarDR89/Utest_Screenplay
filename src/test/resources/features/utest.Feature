# autor ing oscar
# language:es

@historia
Característica: Registrar en utest
  como usuario web, quiero registrame en utest para testiar

  @escenario1
  Escenario: se ingresa a la pagina utest y se oprime el boton de resgistro
    Dado que estoy en la pagina utest relleno todo los formularios
      |  Nombres  |  Apellidos  |  Correo electronico      |  Dia  |  Mes  |  Año   |  Ciudad   |   CodigoPostal    |   Pais      |  Contraseña   |  ConfirmarContraseña   |
      | <Nombres> | <Apellidos> | <Correo electronico>     | <Dia> | <Mes> | <Año>  | <Ciudad>  |  <CodigoPostal>   |  <Pais>     | <Contraseña>  | <ConfirmarContraseña>  |
    Cuando esperar que llege el corro de confirmacion
      |  NombresUsuario  |  ContraseñaInicio  |
      | <NombresUsuario> | <ContraseñaInicio> |
    Entonces si ya verificamos la cuenta ingresamos

  Ejemplo: registro
  |  Nombres  |  Apellidos  |  Correo electronico      |  Dia  |  Mes  |  Año   |  Ciudad   |   CodigoPostal    |   Pais      |  Contraseña   |  ConfirmarContraseña   |
  |  oscar    |  rangel     |  ing.oscard@outlook.com  |  17   |  08   |  1989  |  bogota   |   11118383        |   colombia  |  pasww123     |  pasww123              |

