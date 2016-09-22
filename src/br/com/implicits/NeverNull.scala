package br.com.implicits

object NeverNull {
  
    implicit class ConverterToOption[A](val objeto: A) extends AnyVal{
        def toOption = Option(objeto)
    }
}