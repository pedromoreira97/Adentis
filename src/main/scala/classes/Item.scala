package classes

class Item (
             var custo: BigDecimal,
             var taxaEnvio: BigDecimal,
             var valorImposto: BigDecimal,
             var produto: Product
           ){

  override def toString(): String =
    "(Custo:" + custo + ", Taxa de Envio: " + taxaEnvio + ", Valor do Imposto: " + valorImposto + ", Produto: " + produto + ")";
}