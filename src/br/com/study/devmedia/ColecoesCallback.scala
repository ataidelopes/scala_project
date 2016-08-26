package br.com.study.devmedia

object ColecoesCallback {
    
    def printList(printFuction: (Int) => Unit, aList: List[Int] ) : Unit = {
        for(x <- aList){
          printFuction(x)
        }
    }
    
    def main(args:Array[String]): Unit ={
       val listIdade = List(5, 22, 27, 7, 19, 17, 18)
       println("Escreve as idades")
       printList(x => println(x), listIdade)
       
       println("Escreve o dobro da idade")
       printList(x => println(x * 2), listIdade)
       
       println("Filtra Idades maiores de idade")
       val listaFiltrada = listIdade.filter( x => x >= 18 )
       printList(x => println(x), listaFiltrada)
       
       println("Filtra Idades menores de idade")
       val listaMenores = listIdade.filterNot { x => x >= 18 }
       printList(x => println(x), listaMenores)

    }
}