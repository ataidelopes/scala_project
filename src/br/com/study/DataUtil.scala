package br.com.study

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._
import java.text.SimpleDateFormat

object DataUtil {
  
  /*formata a data para o padrão Brasileiro*/
  def main(args: Array[String]) {    
      print(dataBrasil())
  }
  
  def dataBrasil(): String = {
      val df = new SimpleDateFormat("dd/MM/yyyy")
      return df format new Date
  }
}