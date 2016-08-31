package br.com.study.outros

object StringReference {
  
    def main(args: Array[String]): Unit = {
        val str = new Reference[String]
        
        str.set("Teste de referencia (cast to String)")
        
        val concat: String = str.get
        
        println(concat.concat(" Teste implementação"))
    }
}