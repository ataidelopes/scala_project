package br.com.aula01

class Vaca {
    def mugir() = "Mugindo"
}

class Cachorro{
    def latir() = "latindo"
}

object converter extends App{
    
    var vaca = new Vaca()
    
    def passearComCachorro(dog: Cachorro) = {
        dog.latir
    }
    
    implicit def converter(objeto : Any)= new {
        def latir() = "Um objeto qualquer agora passou a latir"
    }
    
    println(converter(vaca).latir())
}