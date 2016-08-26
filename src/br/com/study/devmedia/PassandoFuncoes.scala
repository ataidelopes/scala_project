package br.com.study.devmedia

object PassandoFuncoes {
  
  def fazConta(tipo:String ,callback: (Int,Int) => Int, x:Int, y:Int){
      println(tipo + callback(x,y))
  }
  
  def soma(x: Int, y:Int): Int = {
      x + y
  }
  
  def multiplicacao(x: Int, y:Int): Int = {
     x * y
  }
  
  def divisao(x: Int, y:Int): Int = {
    x / y
  }
  
  def subtracao(x: Int, y:Int): Int = {
    x - y
  }
  
  def main(args:Array[String]){
    println("[Realizando operações]")
   
    fazConta("Soma: ",soma, 5, 3)
    fazConta("Multiplicação: ",multiplicacao, 5, 3)
    fazConta("divisão: ",divisao, 5, 3)
    fazConta("subtração: ",subtracao, 5, 3)
    
  }
}