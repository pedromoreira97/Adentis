package classes

import java.time.{LocalDate}

class Product (
                var nome: String,
                var categoria: String,
                var morada: String,
                var peso: BigDecimal,
                var preco: BigDecimal,
                var dataCriacao: LocalDate) {

  override def toString(): String =
    "(Nome:" + nome + ", Categoria: " + categoria + ", Morada: " + morada + ", Peso: " + peso + ", Preço: " + dataCriacao + ")";
}