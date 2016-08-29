package br.com.study.devmedia.main

import br.com.study.devmedia.classes.Conta

object Main5 {
    
    def matchTest(x: Any): Any = x match{
        
        case 1 => "um"
        case "dois" => 2
        case "três" => 3
        case "quatro" => new Conta("12345","28563",1000)
        case y: Int => "É um número inteiro"
        case x: Conta => "É um objeto tipo conta"
        case z: String => "É uma String"
    }
    
    def main(args: Array[String]): Unit = {
        println(matchTest("dois"))
        println(matchTest(1))
        println(matchTest(5))
        println(matchTest("três"))
        println(matchTest("quatro"))
        println(matchTest(""))
        println(matchTest(new Conta("","",0)))
        
    }
}