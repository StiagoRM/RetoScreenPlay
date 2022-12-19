#language: es

  Característica: carrrito

    Escenario: Agregar y borrar productos del carrito
      Dado el usuario se encuentre en la pagina
      Cuando agregue un producto con tres cantidades, luego otro producto
      Y elimine todos los productos del carrito
      Entonces el usuario visualizara el carrito de compras vacio