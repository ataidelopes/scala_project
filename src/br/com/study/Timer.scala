package br.com.study

object Timer {
    
    /*define a chamada por segundo*/
    def timeForSecond(callback: () => Unit){ 
        while (true) {
          callback()
          Thread sleep(1000)
        }
    }
    
    /*texto impresso!!
     *inserir aqui a regra!!*/
    def textOfPrint(): Unit = {
        println("executando!")
    }
  
    def main(args:Array[String]): Unit = {
        timeForSecond {textOfPrint}
    }
  
}