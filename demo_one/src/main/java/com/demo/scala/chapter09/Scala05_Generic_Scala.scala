package com.demo.scala.chapter09

object Scala05_Generic_Scala {

  /**
    * 泛型的上下文限制 = 隐式转换 + 泛型
    *
    *
    */
  def main(args: Array[String]): Unit = {

    def f[A:Test](a:A)=println(a)

    implicit val test:Test[User] = new Test[User]

    f(new User())


  }

  class Test[T]{

  }
  class Parent{

  }
  class User extends Parent{

  }
  class SubUser extends User {

  }

}
