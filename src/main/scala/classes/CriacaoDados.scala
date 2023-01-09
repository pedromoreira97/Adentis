package classes

import java.time.{LocalDate, Month, MonthDay, Year}

class CriacaoDados {

  //Produtos
  //declarar função para criar o produto que devolve a lista dos produtos criados
  def createProduct(): List[Product] = {
    val date = LocalDate.of(2022, Month.DECEMBER, 31)
    val date2 = LocalDate.of(2023, Month.JANUARY, 1)
    val date3 = LocalDate.of(2021, Month.JANUARY, 6)
    val date4 = LocalDate.of(2020, Month.DECEMBER, 25)

    //o valor que está em val não pode ser substituído
    val bebida = new Product("Coca-Cola", "Bebida", "Coimbra", 0.7, 2.5,
      date)
    val bebida2 = new Product("Ice-Tea", "Bebida", "Figueira da Foz", 0.65, 2.4,
      date2)
    val fruta = new Product("Morango", "Fruta", "Coimbra", 2, 10,
      date3)
    val fruta2 = new Product("Uva Branca", "Fruta", "Figueira da Foz", 1, 8,
      date4)

    List(bebida, bebida2, fruta, fruta2)
  }

  //Item
   def createItem(): List[Item] = {
      val produto = createProduct();
      val itens = List[Item]()

    //para cada produto cria-se um novo Item porque cada Item tem 1 produto
      produto.foreach(product => {
        val item: Item = new Item(2.5, 2, 1.2, product)
         })
    itens
  }

  //Pedidos

  def createOrder(item: Item): List[Order] = {
    val date = LocalDate.of(2022, Month.DECEMBER, 31)
    val order1 = new Order("Pedro", "123456", "Lisboa", 30, date, item)
    val order2 = new Order("Maria", "000001", "Coimbra", 30, date, item)

    List(order1, order2)
  }



}
