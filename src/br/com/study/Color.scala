package br.com.study

import scala.collection.mutable.ArrayBuffer

class Color(val red:Int, val green: Int , val blue: Int)

case class Red(r: Int) extends Color(r, 0, 0)
case class Green(g: Int) extends Color(0, g, 0)
case class Blue(b: Int) extends Color(0, 0, b) 

object Print {
  
  def printColor(c: Color) = c match {
    case Red(v) => println("Red: " + v)
    case Green(v) => println("Green: " + v)
    case Blue(v) => println("Blue: " + v)
    
    case col:Color => {
        print("R: " + col.red + ", ")
        print("G: " + col.green + ", ")
        println("B: " + col.blue)
    }
  
    case null => println("Invalid color")
  }
  
  def main(args: Array[String]){
      printColor(Blue(50))
      printColor(Red(100))
      printColor(Green(220))

      printColor(new Color(100, 200, 50))
      printColor(null)
      
      var lista = new ArrayBuffer[String];
      lista.+=("teste")
      lista.addString(new StringBuilder("Teste2"));
      print( lista.result().size)
  }

}