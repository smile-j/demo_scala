package com.demo.scala.chapter08

import com.demo.scala.chapter08.Scala05_Transform.User


object Scala05_Transform  extends OtherTrait {

  /**
    * 隐式转换  -作用域
    *
    */

  def main(args: Array[String]): Unit = {

    /**
      * 作用域
      * 1.当前类的内部
      *   隐式转换不能应用于最外层的对象
      * 2.隐式转换的规则 必须和当前的类有关系，才方便查找
      *     父类，父类的伴生对象
      *     特质，特质的伴生对象
      * 3.包对象
      * 4.直接导入
      *
      *
      */
    import com.demo.scala.chapter07._
    val user = new User()
    user.inserUser()
    user.updateUser()

  }
//  implicit class UserExt(user:User){
//    def updateUser(): Unit ={
//      println("update........")
//    }
//  }


  class User{

    def inserUser(): Unit ={
      println("insert。。。。。")
    }

  }

}
class OtherClass{
//  implicit class UserExt(user:User){
//    def updateUser(): Unit ={
//      println("update........")
//    }
//  }
}
//object OtherClass{
//  implicit class UserExt(user:User){
//    def updateUser(): Unit ={
//      println("update........")
//    }
//  }
//}

trait OtherTrait{
//  implicit class UserExt(user:User){
//    def updateUser(): Unit ={
//      println("update........")
//    }
//  }
}
object OtherTrait{
//  implicit class UserExt(user:User){
//    def updateUser(): Unit ={
//      println("update........")
//    }
//  }
}

//implicit class UserExt(user:User){
//  def updateUser(): Unit ={
//    println("update........")
//  }
//}
