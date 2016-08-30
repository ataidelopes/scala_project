package br.com.study.outros

case class User(nome: String, idade: Int)

object User{
    
    def printaCaseClass(user:User): Unit = {
        println(user.nome)
        println(user.idade)
        println(user.hashCode)
        println(user.toString)
        println(user.equals(User("Teste", 15)))
    }
    
    def printaUser(user: User) = user match {
      case User (_, idade) if idade >= 18 => println("maior")
      case _ => println("outro objeto")
    }
    
    def main(args: Array[String]): Unit = {
        printaCaseClass(new User("Teste", 18))
        printaUser(new User("Teste", 18))
    }
}