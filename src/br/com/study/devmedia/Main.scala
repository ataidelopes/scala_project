package br.com.study.devmedia
/*
 * http://www.devmedia.com.br/articles/viewcomp.asp?comp=32850
 * 
 * link do tutorial
 * 
 * @autor Rodrigo
 * */
object Main {
  
  def main(args:Array[String]){
      var num1 = 10
      var num2 = 25
      var texto = "A soma é: "
      
      println(texto + (num1+num2))
      
      var s = new StringBuffer
      
      s.append("Olá! ")
      s.append("iniciando Scala Programming")
      println(s)
  }
}