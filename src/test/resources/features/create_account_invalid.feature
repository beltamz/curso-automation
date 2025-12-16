#language: es

@regression
Característica: Crear cuenta incorrecta

  @TEST-1238
  Escenario: Crear cuenta con campos obligatorios vacios
    Dado que el usuario ingresa a la home
    Y el usuario ingresa a registrar una cuenta
    Cuando envia el formulario de registro dejando algunos campos vacios
    Entonces se muestra un mensaje de error al crear la cuenta