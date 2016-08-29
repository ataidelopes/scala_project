package br.com.study

object Timer {
  
  
   def timerOfSeconds(callback: () => Unit){
       while (true) {
           callback()
           Thread sleep 1000
       }
   }
   
   def textOfPrint(num:Int){
      println( "text print "+num)
   }
   
   def main(args: Array[String]){
       timerOfSeconds{() => textOfPrint(55)}
   }
}