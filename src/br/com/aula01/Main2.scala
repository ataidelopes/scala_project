package br.com.aula01

object Main2 extends App{
    
    implicit var user = "Usuario"
    implicit var qntd = 5
    
    def executaOperacao(f: () => Unit)(implicit usuario:String) = {
        println(usuario + " vai executar uma operação em ")
        f()
        println(usuario + " vai executou uma operação")
    }
    
    def operacao() = println("Executando operação")
    
    executaOperacao(operacao)
}