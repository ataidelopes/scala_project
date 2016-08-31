package br.com.study.loops

object loopInFor {
    
    def forWithUntil() ={
        for(a <- 0 until 10){
            print(" "+a)
        }
    }
    
    def forWithTo () = {
        for( a <- 0 to 10){
            print(" "+ a)
        }
    }
    
    def forWith_Range() = {
        var a, b = 0
        
        for (a <- 1 to 3; b <- 1 to 3){
            print("value of a "+ a)
            print("value of b "+ b)
        }
    }
    
    def forWithAndList() = {
        var a = 0  
        var list = List(1,2,3,4,5,6)
        
        for ( a <- list){
            print("value of a "+ a)
        }
    }
    
    def forEach () = {
        val t = (1,2,3,4)
        
        t.productIterator.foreach { i => println("value "+i) }
    }
}