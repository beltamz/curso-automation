#language: es

@regression
Característica: Carrito de compras

  @TEST-1240
  Escenario: Agregar un producto al carrito
    Dado que el usuario ingresa a su cuenta
    Cuando el usuario agrega un producto al carrito
    Entonces se verifica que el producto aparezca en el carrito