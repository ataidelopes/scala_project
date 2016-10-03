package br.com.aula01

object Aula2 extends App{
  
    def escreveString(s: String)={
        println("escrevendo->"+s)
    }
    
    def somatorio(i: Int*) = {
       /*8*/ "Soma="+i.reduceLeft((a: Int, b: Int) => a + b)
       /*10*/ "Soma="+i.reduceLeft((a,b) => b + a)
       /*12*/ "Soma="+i.reduceLeft(_+_)
       /*13*/ "Soma="+i.foldLeft(0)(_+_)
       /*14*/ "Soma="+ (0 /: i)(_+_)
    }
    
    escreveString(somatorio(1,4,6))
}