package br.com.study.devmedia.main

import br.com.study.devmedia.classes.Conta
import br.com.study.devmedia.classes.Conta

object UsoConta {
  
    def main(args: Array[String]){
      
        val conta = new Conta("12343", "234543", 1000)
        println("Saque de 500 reais")
        println(conta.saque(500))
        println("Deposito de 1000 reais")
        conta.deposito(1000)
        println(conta)
      
        val conta2 = new Conta("4567", "1236547", 1000)
        println("Saque de 1500 reais")
        println(conta2.saque(1500))
        println("Deposito de 1000 reais")
        conta2.deposito(1000)
        println(conta2)
    }
}