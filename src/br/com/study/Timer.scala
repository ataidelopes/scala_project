package br.com.study

object Timer {
  
    def umPorSegundo(callback: () => Unit){
        while(true){ callback(); Thread sleep 1000}
    }
    
    def oTempoPassa(){
      println("O tempo passa e o homem não percebe. (Dante)")
    }
    
    def main(args: Array[String]){
      umPorSegundo { oTempoPassa }
    }
}