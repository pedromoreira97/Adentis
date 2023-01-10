package classes

import java.time.{LocalDate}

class Order (
              val nome_cliente: String,
              val contacto_cliente: String,
              val morada: String,
              val total_geral: BigDecimal,
              val dataPedido: LocalDate,
              val items: List[Item]){

  override def toString(): String =
    "(Nome do Cliente:" + nome_cliente + ", Contacto do Cliente: " + contacto_cliente + ", Morada: " + morada + ", Total Geral: " + total_geral + ", Data do Pedido: " + dataPedido + ", Items: " + List[Item] +")";
}



