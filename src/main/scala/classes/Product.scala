package classes

import java.time.{LocalDate}

class Product (
                val nome: String,
                val categoria: String,
                val morada: String,
                val peso: BigDecimal,
                val preco: BigDecimal,
                val dataCriacao: LocalDate) {

  override def toString(): String =
    "(Nome:" + nome + ", Categoria: " + categoria + ", Morada: " + morada + ", Peso: " + peso + ", Preço: " + dataCriacao + ")";
}