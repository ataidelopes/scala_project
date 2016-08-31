package br.com.study.outros

class Reference[a] {
  
    private var contents: a = _
    
    def set(value: a) { contents = value}
    def get: a = contents
}