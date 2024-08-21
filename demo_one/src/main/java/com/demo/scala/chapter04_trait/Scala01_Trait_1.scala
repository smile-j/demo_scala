package com.demo.scala.chapter04_trait

object Scala01_Trait_1 {

  /**
    * scala 特质
    *   1.java中所有的接口在scala中使用，都是当作特质来用的
    *   2.特质的用法
    *     trait 可以在构建对象时，将新的功能混入（添加）到对象中
    *
    */

  def main(args: Array[String]): Unit = {

    val user = new User() with Update
    user.insertUser()
    user.updateUser()


  }

  trait Update {
    def updateUser()={
      println("....update user")
    }

  }



  class User  {
    def insertUser()={
      println("....insert user")
    }


  }

}
