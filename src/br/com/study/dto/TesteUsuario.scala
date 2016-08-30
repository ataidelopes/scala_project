package br.com.study.dto

object TesteUsuario extends App{
  
    val numbers = for(i <- 1 to 10) yield i
    for(e <- numbers) print(e + " ")
    print("\n")
    lazy val numbers2 = for(i <- 1 to 10) yield i
    for (e <- numbers2) print(e + " ")
  
    println("\n===============================")
  
    val user = new User
    user.nome = "Rodrigo"
    user.idade = 27
    user.email = "teste@teste.com"
    
    println("nome sem get: "+user.nome)
    println("nome com get: "+user.getNome)
    println("idade sem get: "+user.idade)
    println("idade com get: "+user.getIdade)
    println("email sem get: "+user.email)
    println("email com get: "+user.getEmail)
    
    println("\n===============================")
    
    val empresa = new Empresa
    
    empresa.nome = "Nome Teste"
    empresa.idade = 20
    empresa.email = "teste@teste.com"
    
    println(empresa.nome)
    println(empresa.idade)
    println(empresa.email)
    
    println("\n===============================")
    
    println(empresa.getNome)
    println(empresa.getIdade)
    println(empresa.getEmail)
    println(empresa.getPrimeiroNome)
   
    empresa.getClass
    
}