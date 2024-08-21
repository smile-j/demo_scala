package com.demo.scala.chapter08

object Scala04_Transform {

  /**
    * 隐式转换
    *
    */

  def main(args: Array[String]): Unit = {

    val user = new User()
    user.inserUser()
    user.updateUser()

  }

  //如果当前类的前面加implicit 关键之，表示当前类应用于隐式转换，称之隐式类
  implicit class UserExt(user:User){
      def updateUser(): Unit ={
        println("update........")
      }
  }

  class User{

    def inserUser(): Unit ={
      println("insert。。。。。")
    }

  }

}
