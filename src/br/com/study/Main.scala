package br.com.study

object Main {
  
  def main(args: Array[String]) {
     print("Teste")
     print(retornoBigInt())
     retornovoid("Teste void")
  }
  
  def retornoBigInt(): BigInt = {
    return 10
  }
  
  def retornovoid(msg:String){
    print(msg)
  }
  
  def retornov(): String = {
    return ""
  }
}