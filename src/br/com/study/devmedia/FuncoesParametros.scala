package br.com.study.devmedia

object FuncoesParametros {
  
  def fazConta(callback: (Int,Int) => Int, x:Int, y:Int): Unit = {
      println(callback(x,y))
  }
  
  def contaUmDez(f: (Int) => Unit){
      for(i <- 1 to 10) f(i) 
  }
  
  def main(args:Array[String]){
      println("Realiza as operações matemáticas")
      fazConta((x,y) => x + y, 5, 6)
      fazConta((x,y) => x * y, 5, 3)
      fazConta((x,y) => x / y, 5, 3)
      fazConta((x,y) => x - y, 5, 3)
      
      println("Conta até 10")
      contaUmDez(i => print(i))
  }
}