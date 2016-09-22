package br.com.loteria

object Demo {
  
    def main(args: Array[String]): Unit = {
        val point = new Point(10,20)
        
        printPoint
        
        def printPoint(){
            println ("Point x location : " + point.x);
            println ("Point y location : " + point.y);
        }
    }
}