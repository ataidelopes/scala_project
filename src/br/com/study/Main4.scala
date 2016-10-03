package br.com.study

object Main4 extends App{
  
    def pecorreLista[T](lista: List[T], funcao : (T) => Unit) = {
        for(elemento <- lista){
            funcao(elemento)
        }
    }
    
    def imprimeElemento[T](elemento: T){
        println(elemento)
    }
    
    pecorreLista(List(2,3,4,5,6), imprimeElemento)
}