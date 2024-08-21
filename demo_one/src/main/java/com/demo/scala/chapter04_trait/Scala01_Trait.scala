package com.demo.scala.chapter04_trait

object Scala01_Trait {

  /**
    * scala 特质
    *   scala中特质语法编译后其实就是interface ,但是理解的时候不要仅局限于interface
    *   将特质理解为interface 和 abstract class的结合体更好一些
    *
    *
    *
    *
    *
    */

  def main(args: Array[String]): Unit = {

    val user = new User()
    user.run()

  }

  trait Run extends Exception{
    println("....trait run   ")
    def run():Unit
  }

  class Cat extends Run{

    println("....trait Cat   ")

    override def run(): Unit = {
      println("cat。。。。run......")
    }
  }

  class Person{
    println("....init person   ")
  }
  class User extends  Run{
    println("....init user   ")
    override def run(): Unit = {
      println("user....run...")
    }
  }

}
