package br.com.study.outros

object IntegerReference {
    
    def main(args: Array[String]): Unit = {
        
        val cell = new Reference[Int]
        cell.set(13)
        println("Referência contém a metade " + (cell.get * 2))
    }
}