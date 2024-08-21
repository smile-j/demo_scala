package com.demo.scala.chapter04_trait

object Scala01_Interface {

  /**
    * scala没有接口概念
    * scala可以将多个对象相同的特征从对象玻璃出来，形成一个独立的语法结构 称之为特质（trait）
    *  那么可以将特质混入到这个对象中
    *
    *  特质(trait)的本质就是Interface
    *
    *  向类中混入特质，有2种方式
    *  1.如果存在父类，那么采用with
    *  2.没有父类，可以直接采用extends
    *     如果需要混入多个特质，那么第一个采用extends,后面的都采用with
    *
    *
    *
    */

  def main(args: Array[String]): Unit = {

    val user = new User()
    user.run()

  }

  trait Run{
    def run():Unit
  }

  class Cat extends Run{
    override def run(): Unit = {
      println("cat。。。。run......")
    }
  }

  class Person{

  }
  class User extends Person with Run{
    override def run(): Unit = {
      println("user....run...")
    }
  }

}
