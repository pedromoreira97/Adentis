package classes

class Item (
             val custo: BigDecimal,
             val taxaEnvio: BigDecimal,
             val valorImposto: BigDecimal,
             val produto: Product
           ){

  override def toString(): String =
    "(Custo:" + custo + ", Taxa de Envio: " + taxaEnvio + ", Valor do Imposto: " + valorImposto + ", Produto: " + produto + ")";
}