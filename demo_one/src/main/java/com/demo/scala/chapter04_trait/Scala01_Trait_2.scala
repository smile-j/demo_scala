package com.demo.scala.chapter04_trait

object Scala01_Trait_2 {

  /**
    * scala 特质的初始化顺序
    *   1.父类 > 特质（trait） > 当前类
    *   2.类有多个特质
    *     从左至右 依次执行
    *  3.如果父类和字类同时又 trait
    *     parent Trait > parent class > Current Tacit > Current class
    *
    *  4.在同一次 构建中，初始化只会执行一次
    *
    *
    */

  def main(args: Array[String]): Unit = {

    val user = new User()


  }

  trait MyTrait0 {
    println("...init myTrait0")
  }

  trait MyTrait {
    println("...init myTrait")
  }

  trait MyTrait1 {
    println("...init myTrait1")
  }

 class Parent extends MyTrait {
   println("...init parent")
 }

  class User extends Parent with MyTrait with MyTrait1 {
    println("...init user")

  }

}
