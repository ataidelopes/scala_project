package br.com.study.devmedia.main

object Main8 {
  
  def umPorSegundo(callback: () => Unit){
    while (true) {callback(); Thread sleep 1000}
  }
  
  def texto(){
      println("Texto")
  }
  
  def main(args: Array[String]): Unit = {
      umPorSegundo(texto)
  }
}