package br.com.loteria

class Point(val xc:Int,val yc:Int) {
  
    var x: Int = xc
    var y: Int = yc
    
    def move(dx: Int, dy: Int)={
        x += dx
        y += dy
    }
}

