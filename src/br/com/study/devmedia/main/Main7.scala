package br.com.study.devmedia.main

import java.util.ArrayList
import java.util.Date
import java.text.SimpleDateFormat
import java.net.ServerSocket

object Main7 {
    
    def main(args: Array[String]): Unit = {
      
        val lista = new ArrayList[String]
        
        lista.add("Eduarda")
        lista.add("Luiza")
        lista.add("Bruna")
        
        for(x <- 1 to lista.size()){
            println(lista.get(x-1))
        }
        
        val agora = new Date
        val df = new SimpleDateFormat("dd/MM/yyyy")
        println(df format agora)
        
    }
}