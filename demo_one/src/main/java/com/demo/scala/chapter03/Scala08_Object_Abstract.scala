package com.demo.scala.chapter03

object Scala08_Object_Abstract {

  /**
    * 抽象类
    *
    * 如果父类的是抽象方法，字类必须必须重写
    * 如果父类的方法是完整的，字类方法如果重写，需要增加关键字override
    *
    */

  def main(args: Array[String]): Unit = {



  }

  abstract class User{

    def test():Unit;

  }
  class ChildUser extends User {
    override def test(): Unit = {
      println("hello")
    }
  }

}
