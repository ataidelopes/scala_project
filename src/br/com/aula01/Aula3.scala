package br.com.aula01

object Aula3 extends App{
    
    def imprimeString(s: String)(s2: String)(i: Int) = {
        println(s2+" --> "+ s +" (" + i + ")")
    }
  
    def funcaoDevolveString(i: Int) = {
        "Numero: "+i
    }
  
    def funcaoDevolveInt(i: Int): Int = {
        i
    }
    
    imprimeString("A")("V"){
        funcaoDevolveInt(10)
    }

}