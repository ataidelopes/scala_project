package br.com.study


object Numeros_Perfeitos {
  def main(args: Array[String]) = {    
      println("------NÚMEROS PERFEITOS------")
      println("\nUm número se diz perfeito se eh igual a soma de seus divisores próprios." )
      println("Divisores próprios de um número positivo N são todos os divisores inteiros")
      println("positivos de N exceto o próprio N. ")
      println("Por exemplo, o número 6, seus divisores próprios são 1, 2 e 3, cuja soma = 6. ")
      println("--> 1 + 2 + 3 = 6 ")
      println("Outro exemplo é o numero 28, cujos divisores próprios são 1, 2, 4, 7 e 14,")
      println("e a soma dos seus divisores próprios é 28. ")
      println("--> 1 + 2 + 4 + 7 + 14 = 28  ")
      
      var cont, x, soma, t: Int=0 
      var n = 8 // n = ao número de números perfeitos que irão ser achados
      
      println("\n\nPrograma mostra os 4 primeiros números perfeitos\n")
      while (cont != n) {
          x += 1
          soma = 0
          for (i <- 1 to x - 1) {
              t = x % i
              if(t == 0) {
                  soma += i
              }
          }
          if (soma == x) {
              println(x)
              cont += 1
          }
      }
  }
}