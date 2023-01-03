package classes

import java.time.{LocalDate}

class Order (
              var nome_cliente: String,
              var contacto_cliente: String,
              var morada: String,
              var total_geral: BigDecimal,
              var dataPedido: LocalDate,
              var items: List[Item]){

  override def toString(): String =
    "(Nome do Cliente:" + nome_cliente + ", Contacto do Cliente: " + contacto_cliente + ", Morada: " + morada + ", Total Geral: " + total_geral + ", Data do Pedido: " + dataPedido + ", Items: " + List[Item] +")";
}



