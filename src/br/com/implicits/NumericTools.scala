package br.com.implicits

object NumericTools {
  
    implicit class checkPrime(num :Int){
        def isPrime = ! ((2 until num-1) exists (num % _ == 0))
    }
}