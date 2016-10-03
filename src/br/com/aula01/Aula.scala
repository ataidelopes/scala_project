package br.com.aula01

object Aula extends App{
  
    def percorreLista[T](lista:List[T], funcao: (T) => Unit){
        for(elemento <- lista){
            funcao(elemento)
        }
    }
    
    def imprimeLista[T](elemento: T){
        println(elemento)
    }
    
    percorreLista(List("POO","Procedural","Function"), imprimeLista)
}