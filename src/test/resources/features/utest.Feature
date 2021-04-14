# autor ing oscar
# language:es

@historia
Característica: Registrar en utest
  como usuario web, quiero registrame en utest para testiar

  @escenario1
  Escenario: se ingresa a la pagina utest y se oprime el boton de resgistro
    Dado que estoy en la pagina utest relleno todo los formularios
    Cuando esperar que llege el corro de confirmacion
    Entonces si ya verificamos la cuenta ingresamo