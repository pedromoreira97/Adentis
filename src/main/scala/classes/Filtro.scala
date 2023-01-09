package classes

import java.time.Month

  abstract class Filtro {

    val monthInicial : Month
    val monthFinal : Month

   def filtrarPorIntervalo (monthInicial: Month, monthFinal: Month) : List[Order] {

  }

}
