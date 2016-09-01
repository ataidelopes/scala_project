package br.com.study.loops

object loopInFor {
    
    def forWithUntil() ={
        for(a <- 0 until 10){
            println(" "+a)
        }
    }
    
    def forWithTo () = {
        for( a <- 0 to 10){
            println(" "+ a)
        }
    }
    
    def forWith_Range() = {
        var a, b = 0
        
        for (a <- 1 to 3; b <- 1 to 3){
            println("value of a "+ a)
            println("value of b "+ b)
        }
    }
    
    def forWithAndList() = {
        var a = 0  
        var list = List(1,2,3,4,5,6)
        
        for ( a <- list){
            println("value of a "+ a)
        }
    }
    
    def forEach () = {
        val t = (1,2,3,4)
        
        t.productIterator.foreach { i => println("value "+i) }
    }
    
    def main(args: Array[String]): Unit = {
      forEach()
    }
}