#language: es

@regression
Característica: Logout

  @TEST-1239
  Escenario: Logout correcto
    Dado que el usuario ya tiene una sesion iniciada
    Cuando el usuario se intenta desloguear
    Entonces se verifica que el usuario se desloguee correctamente