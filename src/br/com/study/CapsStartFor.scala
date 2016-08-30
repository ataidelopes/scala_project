package br.com.study

object CapsStartFor extends App {
  
   def fibo(n: Int): Int = n match {
     case 0 => 0
     case 1 => 1
     case _ => fibo(n - 1) + fibo(n - 2)
   }
   
   for(n <- 0 to 10){
       printf("%2d: %d\n", n, fibo(n))
   }
}