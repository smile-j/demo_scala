package com.demo.scala.chapter03

object Scala05_Object_Instants_Mehtod {

  def main(args: Array[String]): Unit = {
    //1.java 中构造方法默认由jvm提供的：无参，公共的
//    val user = new User()

    //2.scala中的构造方法默认jvm提供，无参，公共的，小括号可以省略
//    val user1 = new User

    //3.自定义构造方法，jvm不会提供默认构造方法
    //4.new 构造对象时，应该执行构造方法
    //5.java 中构造方法和类的方法是一致，但是scala中构造方法和类的名称没有关系
//    val user = new User
//    user.User()
    //6.scala是完全面向函数式编程语言，所以万物皆函数，声明类就等同于声明函数
    //  声明类的同时声明函数就是构造函数，当new的时候，函数就执行
    //7.scala的构造函数主要功能就是类的实例化（类主体内容的执行）
    //8.构造函数可以传递参数
    val user= new User("张三")


  }

  class User(name:String) {

    //类的主体 & 构造函数体
    println("user......")

//    def User()={
//      println("user ....instance")
//    }

  }
}
