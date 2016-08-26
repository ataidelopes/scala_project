package br.com.study.devmedia.main

object PatternMatching {
    
    def matchTest(x: Int): String = x match {
        
        case 1 => "um"
        case 2 => "dois"
        case 3 => "tres"
        case 4 => "quatro"
        case 5 => "cinco"
        case 6 => "seis"
        case 7 => "sete"
        case _ => "número passado pode ser qualquer número"

    }
    
    def main(args: Array[String]){
        println(matchTest(3))
        println(matchTest(2))
        println(matchTest(5))
        println(matchTest(23))
    }
}