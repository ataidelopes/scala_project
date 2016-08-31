package br.com.study

import Array._

object ArrayScala{
    
    def main(args: Array[String]): Unit = {
        var myList1 = Array( 1.9, 2.9, 3.4, 3.5)
        var myList2 = Array( 8.9, 7.9, 0.4, 1.5)
        
        var myList3 = concat(myList1, myList2)
        
        /*for (x <- myList3){
            print(" "+x)
        }*/
        
        for(x <- 0 until 10){
            print(" "+x)
        }
    }
}